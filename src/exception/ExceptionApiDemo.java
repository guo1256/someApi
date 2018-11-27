package exception;
/**
 * 找异常常用方法。
 * @author soft01
 *
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e) {
			//输出错误额堆栈信息，有助于定位错误并解决
			e.printStackTrace();
			//获取错误信息
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("完成");
	}

}
