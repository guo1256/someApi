package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：Arrays提供了一个静态方法asList
 * 该方法可以将给定的数组转换为以个List集合
 * @author soft01
 *
 */
public class ArrrayToListDemo {

	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		/*
		 * 对数组转换的集合操作，就是对原数组对应操作
		 */
		//list.add("five");所以无法增删 只能替换
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		List<String> list2 = new ArrayList<String>(list);
		System.out.println("list2:"+list2);
		list2.add("five");
		System.out.println("list2:"+list2);
	}

}
