package string;

/**
 * String提供了一组重载的静态方法：valueOf 作用是将Java中其他类型转换为字符串。 常见的是将基本类型转换为字符串
 * 
 * @author soft01
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int a = 100;
		String str = String.valueOf(a);
		System.out.println("str:" + str);

		str = a + "";
		System.out.println("str:" + str);
	}

}
