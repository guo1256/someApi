package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建a/b/c/d/e/f目录
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()){
			/*
			 * mkdirs方法会将所有不存在的父目录
			 * 一同创建出来
			 */
			dir.mkdirs();
			System.out.println("目录创建完毕!");
		}else{
			System.out.println("目录已存在!");
		}
	}
}









