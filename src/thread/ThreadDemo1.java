package thread;
/**
 * 线程允许我们同时执行多段代码
 * 线程有两种创建方式
 * 1：继承Thread并重写run方法，在run中定义线程要
 * 执行的任务
 * @author soft01
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		/*
		 * 线程启动要调用start，而不是直接调用run方法。
		 * start方法的作用是将线程纳入线程调度中，
		 * 线程调度会统一管理需要并发运行的多个线程，
		 * 调度cpu，分配时间片段给线程，得到时间片段
		 * 的线程会被cpu运行这段时间，运行完毕后，线程
		 * 调度会再分配之间片段给一个线程使cpu运行该线程。
		 * 线程调度分配时间片段给每个线程并非有序的“一人一次”
		 * 但是在整体过程中，每个线程获取的cpu时间片段的次数是基本
		 * 一致的。 
		 * 
		 */
		t1.start();
		t2.start();
		t3.start();

	}

}
/**
 * 第一种创建线程方式存在两种不足：
 * 1：由于java是但继承的，这就导致在实际开发中我们
 * 往往需要继承某个复用方法，而当前类有需要并发运行
 * ，导致不能同时又继承复用方法的类又继承线程
 * 2：定义线程的同时重写run方法定义任务，这就导致了
 * 线程和任务有一个必然的耦合关系。不利于线程的重用。
 * @author soft01
 *
 */
class MyThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的");
		}
	}
}
class MyThread3 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是推销的");
		}
	}
}