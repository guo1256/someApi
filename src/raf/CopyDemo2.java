package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据数量，减少实际读写的次数，可以提高读写效率 对于硬盘而言，随机读写效率差是缺点。但是硬盘块读写效率还是可以保证的 随机读写：单字节读写
 * 块读写：一组一组字节读写
 * 
 * @author soft01
 *
 */

public class CopyDemo2 {
	public static void main(String[] args) throws IOException {

		RandomAccessFile src = new RandomAccessFile("./FishGame.zip", "r");
		RandomAccessFile desc = new RandomAccessFile("./FishGame_cp.zip", "rw");
		/*
		 * 
		 * int read(byte[] data) 一次性读取给定的字节数组长度的字节量 并存入
		 * 到该数组中，返回值为实际读取到的字节量。若返回值为-1，则是文件末尾。
		 * 
		 * void write(byte [] data) 一次性将给定的字节数组中所有字节写出
		 * 
		 * void write (byte [] data,int index,int len) 将给定的字节数组从下标index处开始的连续len
		 * 个字节一次性写出
		 */
		byte[] sub = new byte[1024 * 10];
		int d = -1;// 记录每次读取的字节数据
		long start = System.currentTimeMillis();
		while ((d = src.read(sub)) != -1) {
			// desc.write(sub);
			desc.write(sub, 0, d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:" + (end - start) + "ms");
		src.close();
		desc.close();
	}
}