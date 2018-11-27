package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据，以及RAF指针的操作
 * 
 * @author soft01
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		long pos = raf.getFilePointer();
		System.out.println("pos:" + pos);
		// 向文件中写入int最大值
		int max = Integer.MAX_VALUE;
		/*
		 * 01111111 11111111 11111111 11111111max>>>24
		 */
		raf.write(max >>> 24);
		raf.write(max >>> 16);
		raf.write(max >>> 8);
		raf.write(max);
		/*
		 * RAF提供了方便我们写出基本类型的相关方法
		 */
		// 一次性将给定的int值四字节全部写出
		System.out.println("pos:" + raf.getFilePointer());
		raf.writeInt(max);
		System.out.println("pos:" + raf.getFilePointer());

		raf.writeLong(123l);
		System.out.println("pos:" + raf.getFilePointer());

		raf.writeDouble(123.123);
		System.out.println("pos:" + raf.getFilePointer());

		raf.seek(0);
		System.out.println("pos:" + raf.getFilePointer());

		int d = raf.readInt();
		System.out.println(d);

		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		System.out.println("pos:" + raf.getFilePointer());

		double dou = raf.readDouble();
		System.out.println(dou);

		raf.close();

	}

}
