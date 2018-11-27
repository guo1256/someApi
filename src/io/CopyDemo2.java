package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流：缓冲流是一对高级流 java.io.BufferedOutputStream 
 * java.io.BufferedInputStream
 * 缓冲自己输入输出流是用来加快读写效率的。
 * 
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 使用文件输入流读取原文件，
		 */
		FileInputStream fis = new FileInputStream("FishGame.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("FishGame_cp.zip");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int len = 100;
		/*
		 * 使用了缓冲流读写时，我们就不再需要关注必须用块读写加快效率了。
		 * 因为 缓冲流内部维护了一个字节数组，最终会将我们的读写操作转换
		 * 为块读写加快读写效率的。
		 */
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		bis.close();
		bos.close();
		System.out.println("完成");

	}

}
