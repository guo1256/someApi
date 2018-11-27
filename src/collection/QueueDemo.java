package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列
 * 队列可以存放一组元素，但是存取必须按照先进先出
 * 原则。
 * Queue是一个接口，其继承自Collection，所以队列
 * 也具有集合的特性。add,size等方法依然可用。
 * 
 * Queue也提供了一组进出对的方法。常用实现类为:
 * java.util.LinkedList
 * 
 * @author adminitartor
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//入队操作
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		//出队操作
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		//引用队首元素
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 遍历队列可以使用迭代器(新循环)
		 * 遍历不会影响队列中的元素
		 */
		for(String s : queue){
			System.out.println(s);
		}
		System.out.println(queue);
	}
}













