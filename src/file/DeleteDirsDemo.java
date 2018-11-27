package file;

import java.io.File;

/**
 * 1:编写代码，完成1+2+3+4...100并输出结果
 *   在代码中不得出现for,while关键字。
 *   
 * 2:一个人买汽水，1块钱1瓶汽水，3个瓶盖可以换
 *   1瓶汽水，2个空瓶可以换1瓶汽水，编写一段程序
 *   计算20块钱总共可以买到多少瓶汽水。
 * 
 * 
 * 删除目录
 * 由于delete方法删除目录时要求必须是一个空目录。
 * 那么在实际情况中，我们需要先将一个要删除的目录清
 * 空才可以将其删除。
 * @author adminitartor
 *
 */
public class DeleteDirsDemo {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/**
	 * 删除给定的File所表示的文件或目录、
	 * 
	 * 递归调用
	 * 方法内部调用自己方法的现象称为递归调用
	 * 递归能不用就不用。随着递归的次数增加，内存
	 * 开销较大。
	 * 
	 * 使用递归
	 * 1:递归现象必须在一个分支中控制。
	 * 2:层级尽量少。
	 * 
	 * 
	 * @param file
	 */
	public static void delete(File file){
		if(file.isDirectory()){
			/*
			 * 先将该目录清空
			 * 1:获取该目录中所有子项
			 * 2:遍历将他们一个一个删除
			 */
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++){				
				File sub = subs[i];
				delete(sub);
			}
		}
		file.delete();
		
	}
}













