package map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveDemo {

	public static void main(String[] args) {
		/*
		 * 演示Map的方法
		 * size() 集合中元素的数量
		 * isEmpty() 检测集合是否为空
		 * remove()  删除集合中的元素
		 */
		Map<String, String> map=
				new HashMap<>();
		System.out.println(map.size());
		System.out.println(map.isEmpty()); 
		map.put("u1", "Tom");
		map.put("u2", "Jerry");
		map.put("u3", "Andy");
		map.put("u4", "John");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		//从map中删除u1元素，返回被删除的value
		String val = map.remove("u1");
		System.out.println(val);
		System.out.println(map.size());
		System.out.println(map.isEmpty()); 
		//清空map集合的内容
		map.clear();
		System.out.println(map.size());//0
		System.out.println(map.isEmpty());//true
	}
}









