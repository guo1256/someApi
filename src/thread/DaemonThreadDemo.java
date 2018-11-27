package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程，一个线程创建出来默认都是普通（前台线程），守护线程需要在线
 * 程启动前单独进行设置。
 * 使用上守护线程与普通线程无差别，但是在结束时机上有一点不同，即：当进程结束时，所有正在
 * 运行的守护线程都会被强制中断。
 * 进程结束：当一个进程中的所有前台线程都结束时，进程即结束。
 * @author soft01
 *
 */
public class DaemonThreadDemo {

	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}
				System.out.println("rose:啊啊啊啊啊啊啊啊!");
				System.out.println("扑通！");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack:you jump!I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		rose.start();
		jack.setDaemon(true);
		jack.start();
		System.out.println("main结束了");

	}

}
