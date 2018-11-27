package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles方法，可以指定
 * 一个文件过滤器，然后将一个目录中满足过滤器要求的
 * 子项返回。不满足的则忽略。
 * @author adminitartor
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有文本文件?
		 */
		File dir = new File(".");
//		File[] subs = dir.listFiles(new MyFilter());
		
		//使用匿名内部类形式创建
		File[] subs = dir.listFiles(new FileFilter(){
			public boolean accept(File file){
				return file.getName().endsWith(".txt");
			}
		});
		
		
		
		System.out.println("len:"+subs.length);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}

class MyFilter implements FileFilter{
	public boolean accept(File file) {
		String name = file.getName();
		System.out.println("正在过滤:"+name);
		return name.endsWith(".txt");
		
//		return file.isFile();
	}
	
}








