package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add,remove方法
 * @author adminitartor
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);	
		
		/*
		 * void add(int index,E e)
		 * 将给定元素插入到指定位置
		 */
		//[one,two,2,three,four]
		list.add(2, "2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * 删除当前集合中指定位置对应的元素并将其
		 * 返回
		 */
		//[one,2,three,four]
		String old = list.remove(1);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}





