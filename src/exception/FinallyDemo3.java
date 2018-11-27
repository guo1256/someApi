package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JDK1.7后有一个新特性：自动关闭
 * @author soft01
 *
 */
public class FinallyDemo3 {

	public static void main(String[] args) {
		
		try {
			/*
			 * 实现了AutoCloseable接口的可以定义在这里
			 * 该特性是编译器认可，最终编译器还是会将代码
			 * 改为在flnally中关闭该流
			 */
		FileInputStream fis = new FileInputStream("fos.txt");
		int d =fis.read();
		System.out.println(d);
		}catch (IOException e) {			
			e.printStackTrace();
		}

	}
}
