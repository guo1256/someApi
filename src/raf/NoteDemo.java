package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 练习 完成一个简易记事本工具 程序启动后，用户在控制台输入的每一行字符串都 写入到文件note.txt中。当用户输入"exit"时， 程序退出
 * 
 * @author soft01
 *
 */
public class NoteDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		Scanner scan = new Scanner(System.in);
		System.out.println("输入：");
		String line = null;
		while (true) {
			line = scan.nextLine();
			if ("exit".equals(line)) {
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}

		raf.close();
	}
}
