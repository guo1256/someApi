package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入自己生日，然后经过程序计算，输出到今天为止一共
 * 活了多少天
 * 例如：
 * 1992-08-02
 * 
 * 计算后输出到今天为止共活了xxxx天
 * @author soft01
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的生日：");	
		String birthstr = scan.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthstr);
		long time = birth.getTime();
		Date now = new Date();
		long timeNow =now.getTime();
		System.out.println("你活了："+(timeNow-time)/1000/60/60/24+"天");
		time += 10000*24*60*60*1000l;
		Date memory = new Date(time);
		System.out.println("10000天纪念日为："+sdf.format(memory));

	}

}
