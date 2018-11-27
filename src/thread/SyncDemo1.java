package thread;
/**
 * 当多个线程并发操作同一资源时就形成了“抢”的局面，
 * 由于线程切换不确定，可能会导致线程操作该资源时未按照
 * 程序预订的执行顺序执行代码，导致逻辑出现混乱。严重时
 * 可能导致系统瘫痪。
 * @author soft01
 *
 */
public class SyncDemo1 {

	public static void main(String[] args) {
		final Table t = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+" "+bean);
				}				
			}
		};	
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+" "+bean);
				}				
			}
		};	
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans = 20;
	/*
	 * 当一个方法被synchronized修饰后，那么该方法
	 * 称为同步方法，即：多个线程不能同时在方法内部执行，
	 * 从而解决了并发安全问题。
	 * 在方法上使用synchronized 那么同步监视器对象就是当前方法内部看到的
	 * this
	 */
	public synchronized int getBean() {
		if(beans==0) {
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();//模拟线程切换
		return beans--;
	}
}