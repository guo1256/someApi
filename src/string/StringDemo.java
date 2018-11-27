package string;

/**
 * 字符串
 * 
 * @author soft01
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";// 字面量
		String s2 = "123abc";
		String s3 = "123abc";
		// s2,s3重用s1创建的字符串对象
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		// 修改内容会创建新对象
		s1 = s1 + "!";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		// new 一定创建新对象
		String s4 = new String("123abc");
		System.out.println(s2 == s4);
		/*
		 * 编译器有一个优化措施： 当一个计算表达式计算符号两边都是字面量时， 编译器会直接将结果计算出来并替代原来的表达式，
		 * 所以jvm在运行class文件时，看到的下面代码被编译器改为了： String s5 = “123abc”； 所以会重用上面s2对象
		 * 
		 * 
		 */
		String s5 = "123" + "abc";
		System.out.println(s2 == s5);
		// 改变内容会创建新对象
		String s = "123";
		String s6 = s + "abc";
		System.out.println(s2 == s6);
	}

}
