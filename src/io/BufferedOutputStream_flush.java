package io;

//使用缓冲输出流的缓冲区问题
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		String line = "hgcdhgchchc";

		byte[] data = line.getBytes("UTF-8");

		bos.write(data);
		// 强制缓冲流一次写出
		bos.flush();

		bos.close();
		System.out.println("完成 ");

	}

}
