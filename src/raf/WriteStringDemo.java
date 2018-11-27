package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出字符串操作
 * 
 * @author soft01
 *
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 在相对路径中“，/”可以不写，不写默认也是 在当前目录中
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		/*
		 * String提供的方法 byte[] getBytes() 将当前字符串按照指定字符集转换为 一组字节。因为按照系统默认字符集
		 * 转换会导致跨平台出现乱码问题。
		 * 
		 * GBK:国标编码 中文2字节 UTF-8：中文3字节 英文1字节 ISO8859-1：欧洲编码集，不支持中文
		 */
		String str = "让我再看你一遍，从南到北。";
		byte[] data = str.getBytes();
		raf.write(data);
		raf.write("傻逼".getBytes());
		System.out.println("完毕！");
		raf.close();

	}

}
