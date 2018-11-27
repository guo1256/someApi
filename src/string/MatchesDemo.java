package string;

/**
 * 字符串支持正则表达式的方法之一： boolean matches(String regex) 使用给定的正则表达式验证当前字符串是否满足格式
 * 要求，满足则返回true
 * 
 * @author soft01
 *
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email = "fancq@tedu.cn.com";
		/*
		 * email 对应的正则表达式 [a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		// matches方法中正则表达式不写边界符也是全匹配
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}

}
