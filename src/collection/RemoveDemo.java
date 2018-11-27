package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 * @author adminitartor
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * 删除也是依靠元素equals比较的结果
		 */
		c.remove(p);
		System.out.println(c);
	}
}




