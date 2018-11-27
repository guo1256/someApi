package file;

import java.io.File;

/**
 * 删除目录
 * @author adminitartor
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * 将当前目录中的demo目录删除
		 */
		File dir = new File("./a");
		if(dir.exists()){
			/*
			 * 删除目录的前提条件是该目录是一个
			 * 空目录
			 */
			dir.delete();
			System.out.println("删除完毕!");
		}else{
			System.out.println("目录不存在!");
		}
	}
}







