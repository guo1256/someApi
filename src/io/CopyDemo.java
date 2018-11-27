package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * 
 * @author soft01
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 使用文件输入流读取源文件，使用文件输出流往新文件里写。 使用块读写形 式 将原文件数据写入到新文件完成复制操作
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");
		byte[] data = new byte[1024 * 10];
		int len = 100;
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}

		fis.close();
		fos.close();
		System.out.println("完成");

	}

}
