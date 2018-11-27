package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author adminitartor
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/*
		 * 获取当前目录(项目目录)中的所有子项
		 */
		File dir = new File(".");
		/*
		 *	boolean isFile()
		 *  boolean isDirectory()
		 *  判断当前File表示的是文件还是目录
		 */
		if(dir.isDirectory()){
			//获取所有子项
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
			
		}
		
	}
}



