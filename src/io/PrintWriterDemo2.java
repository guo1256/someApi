package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 在流连接中使用PrintWriter
 * @author soft01
 *
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		
		BufferedWriter bw = new BufferedWriter (osw);
		
		PrintWriter pw = new PrintWriter (bw);
		pw.println("sdf");
		pw.print("sdf");
		System.out.println("写完");
		pw.close();

	}

}
