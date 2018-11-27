package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合间的操作
 * @author adminitartor
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("java");
		c.add("c");
		c.add(".net");
		System.out.println("c:"+c);
		
		Collection c2 = new HashSet();
		c2.add("php");
		c2.add("android");
		c2.add("java");
		System.out.println("c2:"+c2);
		/*
		 * boolean addAll(Collection c)
		 * 将给定集合中的所有元素添加到当前集合中
		 */
		c.addAll(c2);
		System.out.println("c:"+c);
		
		Collection c3 = new ArrayList();
		c3.add("c");
		c3.add("php");
		c3.add("c++");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean containsAll = c.containsAll(c3);
		System.out.println("全包含:"+containsAll);
		
		/*
		 * boolean removeAll(Collection c)
		 * 删除当前集合中与给定元素的交集部分
		 */
		c.removeAll(c3);
		System.out.println("c:"+c);
		
	}
}








