package io;
/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * Java.io.BufferedReader
 * 内部有缓冲区，可以读写字符。并且可以按行读写字符串。
 * java.io.PrintWrite
 * 具有自动行刷新的缓冲字符输出流，内部总是会连接
 * BufferedWriter作为缓冲操作。
 * 
 * @author soft01
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException, UnsupportedEncodingException {
		
	/*
	 * PrintWriter提供了直接对文件写操作的
	 * 构造方法
	 * PrintWriter(String path)
	 * PrintWriter(File file)
	 */
	PrintWriter pw = new PrintWriter("pw.txt","GBK");
	pw.println("sdf");
	pw.print("sdf");
	pw.close();
	System.out.println("写完");
	
	}
}
