package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEnrtySetDemo {

	public static void main(String[] args) {
		/*
		 * 利用EntrySet对map集合进行遍历
		 */
		Map<String, String> map=
				new HashMap<>();
		//如下数据相当于从浏览器收到的请求头
		map.put("Host", "doc.tedu.cn");
		map.put("Connection", "keep-alive");
		map.put("Cache-Control", "max-age=0");
		//...
		//遍历全部的请求头
		//map 没有提供之间遍历的方法！
		//可以利用 entrySet 和 keySet 间接实现遍历
		// Entry 对象就代表map中的key-value对
		// 一个Entry 对象中包含两个属性，一个是key
		// 一个是Value，Entry的实现类是HashMap内部类
		Set<Entry<String, String>> set = 
				map.entrySet();
		//set 中包含map中全部的key-value对
		//只要遍历 set 就相当于遍历了map
		for(Entry<String, String> e: set){
			System.out.println(
				e.getKey()+", "+e.getValue());
		}
	}

}



