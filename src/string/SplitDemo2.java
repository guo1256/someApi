package string;

public class SplitDemo2 {

	public static void main(String[] args) {
		/*
		 * 185458854544.jpg
		 */
		String image = "123.jpg";
		String[] names = image.split("\\.");
		image = System.currentTimeMillis() + "." + names[1];
		System.out.println(image);

	}

}
