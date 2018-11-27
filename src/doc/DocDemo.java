package doc;

/**
 * 文档注释 文档注释是功能级注释，用于说明一个类，方法，常量的功能。
 * 
 * 在类上使用文档注释，用于说明设计此类的意图，以及这个类解决的问题等信息。
 * 
 * @author 帅哥
 * @version 1.2012
 * @see java.lang.Srtring
 * @since JDK1.8
 */
public class DocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "你好！";

	/**
	 * 对给定的用户添加问候语
	 * 
	 * @param name
	 *            给定用户名
	 */
	public void sayHello(String name) {
		System.out.println(INFO + name);
	}
}
