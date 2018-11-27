package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPutAll {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		map1.put("u1","Tom");
		map1.put("u2","Jerry");
		map2.put("u3","Andy");
		map2.put("u4","Mac");
		map1.putAll(map2);
		System.out.println(map1);
		System.out.println(map2);
	}

}
