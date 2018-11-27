package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册业务操作 用户信息包含:用户名，密码，昵称，年龄 其中年龄是int值，其他三项为字符串
 * 
 * 每个用户的信息都要写入文件user.dat中保存。 每条记录的长度固定为100字节，其中 用户名，密码，昵称三项各占32字节，年龄int值固定 为4字节。
 * 
 * 字符串"留白"操作便于修改内容。不会影响整个文件的 格式。
 * 
 * @author adminitartor
 *
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("欢迎注册");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();

		System.out.println("请输入密码:");
		String password = scanner.nextLine();

		System.out.println("请输入昵称:");
		String nickname = scanner.nextLine();

		System.out.println("请输入年龄:");
		int age = Integer.parseInt(scanner.nextLine());

		System.out.println("username:" + username);
		System.out.println("password:" + password);
		System.out.println("nickname:" + nickname);
		System.out.println("age:" + age);

		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");

		// 先将指针移动到文件末尾
		raf.seek(raf.length());

		// 写用户名
		byte[] data = username.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);

		// 写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);

		// 写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);

		// 写年龄
		raf.writeInt(age);

		System.out.println("注册完毕!");
		raf.close();
	}
}
