package integer;

/**
 * 数字类型的包装类都有两个常量：MAX——VALUE，MIN——VALUE 用于表示其对应的基本类型数据的取值范围
 * 
 * @author soft01
 *
 */

public class IntegerDemo2 {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);

		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);

	}

}
