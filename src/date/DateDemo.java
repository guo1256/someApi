package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.Data
 * Date的每一个实例用于表示一个确切的时间。内部维护
 * 一个long值，该值为1970年1月1日00：00：00到当前
 * Date所表示的时间之间所经历的毫秒。
 * 由于Date设计时存在时区问题，所以大部分操作时间的
 * 方法都被声明为过时的，不再建议使用。
 * @author soft01
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		//默认实例化表示当前系统时间
		Date date = new Date();
		System.out.println(date);
		//获取Date内部维护的long值
		long time = date.getTime();
		
		time += 1000*60*60*24;
		//可以设置一个long指使Date表示该日期
		date.setTime(time);				
		System.out.println(date);		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * String format（Date date）
		 * 将给定的Date按照当前SDF指定的日期格式
		 * 转换为对应内容的字符串
		 */
		String str = sdf.format(date);
		System.out.println(str);
		

	}

}
