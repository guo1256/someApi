package map;

import java.util.HashMap;
import java.util.Map;

public class MapPutDemo {

	public static void main(String[] args) {
		/*
		 * 将数据添加到Map中
		 */
		Map map = new HashMap();
		//第一次将“u1”-"Tom"添加到到map
		Object obj = map.put("u1", "Tom");
		//第一次返回null
		System.out.println(obj);
		//第二次将“u1”的value替换为Jerry
		obj = map.put("u1", "Jerry");
		//返回被替换的Tom
		System.out.println(obj);
		//显示Map中的内容 ？思考如下输出用了那个方法
		System.out.println(map); //toString()
		
		/*
		 * 利用泛型定义类型安全的map集合 
		 */
		Map<String, String> map2=
				new HashMap<>();
		//Java 6 中不能省略 <String, String>
		//Map<String, String> map3=
		//		new HashMap<String, String>();
		String s = map2.put("u1", "Tom");
		System.out.println(s);
		s = map2.put("u1", "Jerry");
		System.out.println(s);
		System.out.println(map2); 
		
	}
}








