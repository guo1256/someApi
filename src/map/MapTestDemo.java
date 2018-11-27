package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapTestDemo {
	public static void main(String[] args) {
		/*
		 * 纵向比较 map 的查询性能
		 */
		test(1000);
		test(10000);
		test(100000);
		/*
		 * 横向对比 HashMap和LinkedList的查询性能 
		 */
		testLinkedList(10000);
		testLinkedList(100000);
	}
	/**
	 * 测试LinkedList的查找性能
	 * LinkedList 采用双向循环链表结构，
	 * 它的头尾查询性能好，中部查找性能差
	 */
	public static void testLinkedList(int n){
		LinkedList<String> list=
				new LinkedList<>();
		for(int i=0; i<n; i++){
			list.add("u"+i);
		}
		//从LinkedList中部查询数据
		long t1=System.nanoTime();
		String str = list.get(n/2);
		long t2=System.nanoTime();
		System.out.println(str);
		System.out.println(t2-t1);
	}
	
	/**
	 * 性能测试方法
	 */
	public static void test(int n){
		Map<Integer, String> map=
			new HashMap<>(n+n/2);
		for(int i=0; i<n; i++){
			//i=0 1 2 ... n-1
			String val = "n"+i;
			map.put(i, val);
		}
		//nanoTime() 返回系统纳秒数1ms=1000000ns
		long t1 = System.nanoTime();
		String v = map.get(n-1);
		long t2 = System.nanoTime();
		System.out.println(v); 
		System.out.println(t2-t1);
	}
}









