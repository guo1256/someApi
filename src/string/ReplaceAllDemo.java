package string;

/**
 * 字符串支持正则表达式方法三： String ReplaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的 字符串。
 * 
 * @author soft01
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "asd654asd465dsf";
		/*
		 * 将数字部分替换为#NUMBER#
		 */
		str = str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}

}
