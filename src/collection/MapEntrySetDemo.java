package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySetDemo {

	public static void main(String[] args) {
		/*
		 * 利用EntrySet对map集合进行遍历
		 */
		Map<String,String> map = new HashMap<>();
		map.put("Host", "doc.tedu.cn");
		map.put("Connection", "keep-alive");
		map.put("Cache-Control", "max-age=0");
		//.....
		//遍历全部的请求头
		//map没有提供直接遍历的方法
		//可以利用EntrySet和KeySet简介实现遍历
		//Entry 对象代表map中的key-value对
		//一个Entry 对象中包含两个属性，一个是key
		//一个是value，Entry的实现类是HashMap内部类
		Set<Entry<String,String>> set = map.entrySet();
		//set中包含map中全部的key-value
		//只要遍历set就相当于遍历了map
		for (Entry<String, String>  e: set) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		

	}

}
