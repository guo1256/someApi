package exception;
/**
 * finally块时异常捕获机制中的最后一块。
 * finally可以直接跟在try后面或者最后一个catch之后。
 * finally可以保证只要程序执行到try语句块中，无论
 * try语句块中的代码是否抛出异常，finally块中的代码
 * 都必定执行。
 * 通常会将无论是否出现异常都要运行的代码放在finally中确保
 * 运行，比如IO操作中的关闭流。
 */
public class FinallyDemo1 {

	public static void main(String[] args) {
		

	}

}
