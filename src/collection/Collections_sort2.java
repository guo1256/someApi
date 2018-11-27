package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义元素的集合
 * @author adminitartor
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<Point> list 
			= new ArrayList<Point>();
		
		list.add(new Point(5,6));
		list.add(new Point(2,7));
		list.add(new Point(8,9));
		list.add(new Point(1,3));
		list.add(new Point(4,2));
		System.out.println(list);
		/*
		 * Collections的sort方法在排序集合时要求
		 * 集合元素必须实现Comparable接口。
		 */
		Collections.sort(list);
		System.out.println(list);
		
	}
}




