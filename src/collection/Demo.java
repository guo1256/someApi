package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
	public static void main(String[] args) {
		int a = 1;
		String s = "hello";
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		c.add(p);
		test(a,s,p,c);
		System.out.println("a:"+a);
		System.out.println("s:"+s);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
	}
	public static void test(int a,String s,Point p,Collection c){
		a = a+1;
		s = "world";
		Point p2 = p;
		p.setY(8);
		p = new Point(3,4);
		c.add(p);
		c = new ArrayList();
		c.add(p);
		p.setX(8);
		p2.setX(9);
		
		
	}
}



