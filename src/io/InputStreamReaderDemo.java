package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *转换流
 *InputStreamReader,可以读取字符
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		
		int d = -1;
		while((d=isr.read())!=-1) {
			System.out.println((char)d);
		}
		/*
		 * char[] data = new char[30];
			int len = -1;
			while((len=isr.read())!=-1) {
			String str = new String(data,0,len);
			System.out.println(str);
		}
		*/
		isr.close();
	}
}
