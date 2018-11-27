package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 向一个List集合中添加10个100以内的随机数，然后
 * 按照从大到小的顺序排序集合
 * @author adminitartor
 *
 */
public class TestSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i =0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
				return o2-o1;
			}
		});
		System.out.println(list);
	}
}









