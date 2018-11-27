package object;

/**
 * 测试Point重写的Object方法
 * 
 * @author soft01
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(1, 2);
		/*
		 * Object定义的toString方法返回的是该 对象的地址信息。实际开发中意义不大。 所以若我们要使用，通常会重写这个方法。
		 * 注意：java提供给我们的类妥善重写过该方法。 只有我们自己定义的类通常要重写。
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * system.out.println(Object o) 该方法会将给定对象toString方法返回的 字符串输出到控制台
		 */
		System.out.println(p);
		Point p2 = new Point(1, 2);
		System.out.println(p == p2);
		/*
		 * Object提供的equals内部就是“==”比较 所以不重写没有实际意义。
		 */
		System.out.println(p.equals(p2));

	}

}
