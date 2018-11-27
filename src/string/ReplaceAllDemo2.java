package string;

//和谐用语
public class ReplaceAllDemo2 {

	public static void main(String[] args) {
		String regex = "wqnmlgb|cnm|mmp";
		String message = "mmp!cnm!";
		message = message.replaceAll(regex, "*");
		System.out.println(message);
	}

}
