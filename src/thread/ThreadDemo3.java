package thread;
/**
 * 使用匿名内部类完成两种线程创建方式
 * @author soft01
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁啊");
				}
				Thread main = Thread.currentThread();
				System.out.println(main);
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("关你屁事");
				}
				Thread main = Thread.currentThread();
				System.out.println(main);
			}						
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
