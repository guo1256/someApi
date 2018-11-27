package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 该类设计用来专门读写文件数据。其基于指针进行读写，
 * 即:总是在指针当前位置读或写字节。
 * 
 * RAF有两种常用创建模式:
 * "r":只读模式
 * "rw":读写模式
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * RAF常用的构造方法:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * mode:操作模式，只读或读写
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
				"./raf.dat","rw"
			);
		/*
		 * void write(int d)
		 * 写出一个字节，将给定的int值对应的2进
		 * 制的“低八位”写入文件
		 *                            vvvvvvvv
		 * 00000000 00000000 00000001 00000001
		 * 
		 * 11111111 11111111 11111111 11111111
		 */
		raf.write(1);
		System.out.println("写出完毕!");
		
		raf.close();
	}
	
}









