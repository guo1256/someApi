package map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyDemo {

	public static void main(String[] args) {
		/*
		 * 测试 containsKey 方法
		 * 检测集合中是否包含指定的key
		 */
		Map<String, String> map=
				new HashMap<>();
		map.put("u1", "Tom");
		map.put("u2", "Jerry");
		map.put("u3", "Andy");
		map.put("u4", "Mac");
		//map中允许添加一个key为null的数据
		map.put(null, "Wang");
		//map集合无序！
		System.out.println(map);
		//检测map集合是否包含指定的key
		boolean b1 = map.containsKey("u1");
		boolean b2 = map.containsKey("u5");
		boolean b3 = map.containsKey(null);
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
	}

}
