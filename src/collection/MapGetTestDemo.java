package collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapGetTestDemo {

	public static void main(String[] args) {
		test(1000);
		test(10000);
		test(100000);
		testLinledList(10000);
		testLinledList(100000);
	}
	public static void test(int n) {
		Map<Integer,String> map = new HashMap<>(n+n/2);
		for (int i = 0;i < n; i++) {
			String value = "n"+i;
			map.put(i, value);
		}
		long t1 = System.nanoTime();
		String str = map.get(n-1);
		long t2 = System.nanoTime();
		System.out.println(str);
		System.out.println(t2-t1);
	}
	/**
	 * 测试LinkedList的查找性能
	 * LinkedList 采用双向循环链表结构，两端查询快，
	 * 中间查询慢
	 * 
	 * @param n
	 */
	public static void testLinledList(int n) {
		LinkedList<String> list = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			list.add("u"+i);
		}
		long t1 = System.nanoTime();
		String str = list.get(n/2);
		long t2 = System.nanoTime();
		System.out.println(str);
		System.out.println(t2-t1);
	}
}
