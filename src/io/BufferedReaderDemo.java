package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 * @author soft01
 *
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将当前源代码读取出来并输出到控制台
		 */
		FileInputStream fis = new FileInputStream("src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
