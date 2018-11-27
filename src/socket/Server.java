package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 * @author adminitartor
 *
 */
public class Server {
	/**
	 * 运行在服务端的java.net.ServerSocket
	 * 主要有两个作用
	 * 1:向系统申请服务端口，客户端就是通过这个端口
	 *   与服务端建立连接的。
	 * 2:监听服务端口，等待客户端连接。一旦一个客户端
	 *   通过服务端口与服务端建立连接，那么ServerSocket
	 *   会主动创建一个Socket与客户端进行通讯。  
	 */
	private ServerSocket server;
	/*
	 * 由于ClientHandler是Server的内部类，那么
	 * 在Server上定义的属性可以被ClientHandler的
	 * 实例访问，从而可以用于让所有ClientHandler
	 * 共享数据使用。
	 */
	//private PrintWriter[] allOut = {};
	private List<PrintWriter> allOut = new ArrayList<PrintWriter>();
	
	/**
	 * 用来初始化服务端
	 */
	public Server(){
		try {
			System.out.println("启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void start(){
		try {
			/*
			 * ServerSocket提供的方法:
			 * Socket accept()
			 * 该方法是一个阻塞方法，调用后进入
			 * 阻塞，直到一个客户端连接为止，这时
			 * 该方法会返回一个Socket，通过这个
			 * Socket可以与刚建立连接的客户端进行
			 * 通讯。
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了!");
				//启动一个线程，处理该客户端交互工作
				ClientHandler handler 
					= new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	/**
	 * 该线程负责处理指定客户端的交互工作
	 * @author adminitartor
	 *
	 */
	private class ClientHandler 
						implements Runnable{
		//当前线程通过这个Socket与对应客户端交互
		private Socket socket;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
		}
		
		public void run() {
			PrintWriter pw = null;
			try {
				System.out.println("启动了一个线程处理客户端交互!");
				InputStream in 
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				/*
				 * 通过Socket获取输出流，用于给客户端
				 * 发送消息
				 */
				pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							socket.getOutputStream(),"UTF-8"	
						)	
					),true	
				);
				/*
				 * 将该输出流存入allOut,以便其他的ClientHandler
				 * 可以将消息发送给当前客户端
				 */
				synchronized (allOut) {
//					//1先扩容allOut
//					allOut = Arrays.copyOf(allOut, allOut.length+1);
//					//2将当前客户端输出流存入数组最后
//					allOut[allOut.length-1] = pw;
//					System.out.println("当前在线人数:"+allOut.length);
					allOut.add(pw);
					System.out.println("当前在线人数:"+allOut.size());
				}
				
				
				
				/*
				 * 当客户端与服务端断开连接时，不同系统的客户端
				 * 在服务端这边体现的不太一样。
				 * windows的客户端断开时，服务端这里br.readLine
				 * 方法通常会直接抛出异常。
				 * linux的客户端断开时，服务端br.readLine方法会
				 * 返回null.
				 */
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println("客户端说："+message);
					//将消息发送给客户端
//					pw.println("客户端说："+message);
					
					synchronized (allOut) {
						//遍历allOut，转发消息
//						for(int i=0;i<allOut.length;i++){
//							allOut[i].println("客户端说："+message);
//						}
						for(PrintWriter o:allOut) {
							o.println("客户端说："+message);
						}
					}

				}
				
				
			} catch (Exception e) {
				
			} finally{
				//处理客户端断开连接的操作
				
				//将该客户端的输出流从共享数组中删除      
				synchronized (allOut) {
//					for(int i=0;i<allOut.length;i++){
//						if(allOut[i]==pw){
//							allOut[i] = allOut[allOut.length-1];
//							allOut = Arrays.copyOf(
//									allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
				}
				System.out.println("当前在线人数:"+allOut.size());
				
				
				
				//关闭socket，释放资源
				if(socket != null){
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}	
	}	
}



