package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FilePointer {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		// 获取指针位置
		long pos = raf.getFilePointer();
		System.out.println("pos:" + pos);
		// 向文件中

	}

}
