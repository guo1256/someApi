package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 登入验证
 * 
 * 程序启动后，要求用户输入用户名及密码 然后匹配user.dat文 件中的用户，若 用户 名及密码 输入正确提示登录成功，否则提示用户名或密码不正确
 * 
 * @author soft01
 *
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入用户名：");
		String name = scan.nextLine();
		System.out.println("输入密码：");
		String word = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		boolean check = false;
		for (int i = 0; i < raf.length() / 100; i++) {
			raf.seek(100 * i);
			byte[] data = new byte[32];
			raf.read(data);
			String username = new String(data, "UTF-8").trim();
			if (name.equals(username)) {
				raf.read(data);
				String passward = new String(data, "UTF-8").trim();
				if (word.equals(passward)) {
					System.out.println("登入成功");
					check = true;
				}
				break;
			}

		}
		if (!check) {
			System.out.println("用户名或密码不正确");

		}
		raf.close();
	}
}