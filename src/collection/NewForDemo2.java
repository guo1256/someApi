package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用新循环遍历集合
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		/*
		 * 新循环遍历集合就是迭代器遍历集合。所以
		 * 在遍历过程中不能通过集合的方法增删元素
		 */
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
	}
}









