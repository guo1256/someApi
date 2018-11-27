package exception;
/**
 * java异常处理机制中的try-catch
 * 语法：
 * try{
 * 代码片段
 * }catch（XXXException e）{
 * 捕获try代码片段中出现的XXXException后的处理手段
 * }
 * @author soft01
 *
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
		String str = "";
		/*
		 * 当JVM执行代码时遇到异常时，会实例化该异常的
		 * 一个实例，然后设置好代码执行的过程，并将该异常抛出。
		 * 如果抛出异常的代码所在方法没有处理异常的能力，异常会抛到当前方法
		 * 之外，由调用当前方法的代码片段去处理。
		 */
		//System.out.println(str.length());
		
		//System.out.println(str.charAt(0));
		//System.out.println(Integer.parseInt(str));
		
		/*
		 * try代码片段出错的代码之后的内容不会运行
		 */
		System.out.println("!!!!");
		}catch(NullPointerException e){
			System.out.println("出现了空指针");
			//catch可以定义多个，针对不同异常有不同处理手段时
			//，可以分别捕获这些异常
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界");
		}catch(NumberFormatException e) {
			System.out.println("数字格式出错");
			/*
			 * 应当有一个好习惯，避免未知异常导致程序中断
			 * 子类异常在上 父类异常在下
			 */
		}catch(Exception e){
			System.out.println("反正出了个错");
		}finally {
			System.out.println("finally中的代码运行了");
		}
		System.out.println("结束");

	}

}
