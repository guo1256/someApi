package string;

public class Test {

	public static void main(String[] args) {
		// 截取出域名“baidu”
		String name = getHostName("www.baidu.com");
		System.out.println("name:" + name);

		name = getHostName("www.sohu.com");
		System.out.println("name:" + name);
	}

	public static String getHostName(String str) {
		int a = str.indexOf(".");
		int b = str.lastIndexOf(".");
		String sub = str.substring(a + 1, b);
		return sub;
	}
}
