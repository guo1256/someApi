package string;

/**
 * boolean startWith(String str) boolean endWith(String str)
 * 判断当前字符串是否以给定的字符开始或结束
 * 
 * @author soft01
 *
 */
public class StartsWithDemo {

	public static void main(String[] args) {
		String str = "thinking in java";

		boolean starts = str.startsWith("thi");
		System.out.println("starts:" + starts);

		boolean ends = str.endsWith("ava");
		System.out.println("ends:" + ends);

	}

}
