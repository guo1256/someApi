package date;

import java.util.Calendar;

/**
 * Calendar提供了计算时间的方法：
 * void add（int filed,int amount）
 * 对给定的时间分量加上指定的值，若给定的
 * 值为负数则是减去。
 * @author soft01
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 查看3年2个月零25天以后是哪天？
		 */
		//加三年
		calendar.add(Calendar.YEAR, 3);
		//加两个月
		calendar.add(Calendar.MONTH, 2);
		//加二十五天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
	}
}
