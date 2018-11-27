package string;

/**
 * String substring(int s, int e)； 截取当前字符串s到e范围(不包含e)的字符串
 * 
 * @author soft01
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		// 01 23456789012345
		String str = "thinking in java";
		// 截取“ing”
		String sub = str.substring(5, 8);
		System.out.println(sub);
	}

}
