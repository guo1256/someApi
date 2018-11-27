package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 使用PrintWriter,用流连接形式创建。
 * 完成记事本功能。
 * 将控制台输入的每一行字符串写入文件note.txt中。
 * @author soft01
 *
 */
public class PrintWriterDemo3 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * PrintWriter的构造方法若是第一个参数是一个流，
		 * 那么就支持第二个参数，该参数为boolean型，若
		 * 值为true时，那么pw就具有了自动行刷新功能。
		 * 即：每当使用println方法写出一行字符串后会自动flush
		 * 注意，调用print方法是不会自动行刷新的
		 */
			
		PrintWriter pw = new PrintWriter (
			new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("note.txt"),
							"UTF-8"
							)
					),true
			);
		System.out.println("请开始输入：");
		String line = null;
		while(true) {
			line=scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
		}
		
		pw.close();
		System.out.println("完成");
		
		

	}

}
