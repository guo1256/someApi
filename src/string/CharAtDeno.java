package string;

/**
 * char charAt(int index) 获取指定位置对应的字符
 * 
 * @author soft01
 *
 */
public class CharAtDeno {

	public static void main(String[] args) {
		String str = "thinking in java";
		// 查看第五个字符是什么？
		char c = str.charAt(4);
		System.out.println(c);

		// 检测回文
		String info = "上海自来水来自海上";
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) != info.charAt(info.length() - 1 - i)) {
				System.out.println("不是回文！");
				return;
			}
		}
		System.out.println("是回文");

	}

}
