package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 使用Collections.sort(List)排序时会存在一些
 * 不足之处
 * 1:该方法要求集合元素必须实现Comparable接口，这
 *   在实际开发中是不太可取的，因为该功能会对我们写
 *   的代码有侵入性
 *   所谓侵入性是指:当我们调用某个功能时，该功能要求
 *   我们为其修改代码，修改的地方越多，侵入性越高。不
 *   利于程序扩展和后期维护。
 * 
 * 2:若元素已经实现了Comparable接口并定义了比较规则，
 *   但是该规则不满足我们排序需求时，该方法就无法使用。
 *   比如排序字符串，只能按照字符unicode编码排序。排
 *   序中文时则没什么意义。
 * @author adminitartor
 *
 */
public class Collections_sort3 {
	public static void main(String[] args) {
		List<String> list
			= new ArrayList<String>();
				
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}








