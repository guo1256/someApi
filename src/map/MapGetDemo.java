package map;

import java.util.HashMap;
import java.util.Map;

public class MapGetDemo {

	public static void main(String[] args) {
		/*
		 * 测试map的查询方法get
		 * 1. 如果找到就返回key对应的值
		 * 2. 如果没有找到返回 null
		 */
		Map<String, String> map=
			new HashMap<>();
		//向map中添加数据
		map.put("u1", "Tom");
		map.put("u2", "Jerry");
		//从map中检索
		String v1 = map.get("u1");
		String v2 = map.get("u3");
		System.out.println(v1);
		System.out.println(v2);//null
	}

}





