package file;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例可以用于表示文件系统中的一个文件
 * 或目录
 * 使用File可以:
 * 1:访问文件或目录的属性(名字，大小，修改时间等)
 * 2:操作文件或目录(创建，删除)
 * 3:访问一个目录的子项
 * 但是不能读写文件数据。
 * @author adminitartor
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 路径尽量选取相对路径，不同系统的路径
		 * 方式不同，相对路径可以做到跨平台。
		 * 
		 * elipse中当前目录(./)是当前程序所在项目的目录
		 * 例如:
		 * windows:D:/workspace/JSD1803SE/
		 * linux:home/soft01/eclipse_workspace/JSD1803SE/
		 * 
		 * 
		 */
		File file = new File("./demo.txt");
		
		//获取名字
		String name = file.getName();
		System.out.println("名字:"+name);		
		//获取大小(字节数)
		long len = file.length();
		System.out.println("大小:"+len);
		//可读可写
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("可读:"+cr);
		System.out.println("可写:"+cw);
		//是否隐藏
		boolean ih = file.isHidden();
		System.out.println("是否隐藏:"+ih);
	}
}












