package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
 * 
 * @author adminitartor
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * 集合是用给定元素与集合现有元素进行equals
		 * 比较，若有比较为true的则认为集合包含该
		 * 元素。所以元素的equals方法直接影响集合的
		 * contains方法的结果。
		 */
		boolean contains = c.contains(p);
		System.out.println("contains:"+contains);
		
	}
}









