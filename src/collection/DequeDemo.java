package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque 双端队列
 * Deque接口继承自Queue，双端队列是两端都可以做
 * 进出队操作的队列。
 * 常用实现类:java.util.LinkedList
 * 
 * @author adminitartor
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque 
			= new LinkedList<String>();		
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		
		deque.offerFirst("three");
		System.out.println(deque);
		
		deque.offerLast("four");
		System.out.println(deque);
		
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
	}
}








