package thread;
/**
 * join方法可以协调线程之间的同步运行。
 * join方法会让运行该方法的线程处于阻塞状态，直到
 * 该方法所属线程运行完毕才会接触阻塞。
 * @author soft01
 *
 */
public class JoinDemo {
	private static boolean isFinish=false;
	public static void main(String[] args) {
		final Thread down = new Thread() {
			public void run() {
				System.out.println("down：开始下载图片");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down:下载完毕");
				isFinish=true;
			}		
		};
		Thread show = new Thread() {
			public void run() {
				System.out.println("show：开始显示图片。。。。");
				try {
					down.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish) {
					throw new RuntimeException("图片加载中。。。");
				}
				System.out.println("show:图片显示完毕");
			}
		};
		down.start();
		show.start();

	}

}
