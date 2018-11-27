package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 复制当前目录中的img.png
		 */
		RandomAccessFile src 
			= new RandomAccessFile(
				"./music.mp3","r"
			);
		RandomAccessFile desc 
			= new RandomAccessFile(
				"./music_cp.mp3","rw"	
			);	
		int d = -1;//记录每次读取的字节数据
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println(
			"复制完毕!耗时:"+(end-start)+"ms");		
		src.close();
		desc.close();
	}
}







