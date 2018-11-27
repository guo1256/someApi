package thread;
/**
 * 打断睡眠阻塞
 * @author soft01
 *
 */
public class SleepDemo2 {

	public static void main(String[] args) {
		final Thread lin = new Thread() {
			public void run() {
				System.out.println("林：刚美完容，睡一会儿吧");
				try {
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢！干嘛呢！");
				}
				System.out.println("林：醒了！");
			}
		};
		Thread huang = new Thread() {
			public void run() {
				System.out.println("黄：开始砸墙！");
				for (int i = 0; i < 5; i++) {
					System.out.println("黄：80！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();

	}

}
