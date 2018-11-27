package string;

/**
 * StringBulider是专门设计用来修改字符串内容的。 内部维修一个可改变的字符数组。开销小，性能好。
 * 
 * 所以凡是有频繁修改字符串内容操作时，都应当使用他来完成。
 * 
 * @author soft01
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		/*
		 * 默认创建的StringBuilder表示一个空字符串
		 */
		// StringBuilder builder=new StringBuilder();
		StringBuilder builder = new StringBuilder("好好学习java");
		String str = builder.toString();
		System.out.println(str);
		/*
		 * append方法用于追加给定字符串
		 * 
		 * 好好学习java，为了找个好工作！
		 */
		//builder.append(",为了找个好工作！");
		str = builder.toString();
		System.out.println(str);
		/*
		 * 好好学习java，为了找个好工作！ 好好学习java，就是为了改变世界！ replace替换部分内容
		 */
		builder.replace(9, 17, "就是为了改变世界！");
		str = builder.toString();
		System.out.println(str);
		// 删除指定位置字符串
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		/*
		 * insert将给定内容插入到指定位置
		 */
		//builder.insert(0, "活着");
		str = builder.toString();
		System.out.println(str);
	}

}
