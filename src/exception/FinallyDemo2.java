package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyDemo2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
			try {
				fis = new FileInputStream("fos.txt");
				int d =fis.read();
				System.out.println(d);
			}catch (IOException e) {			
				e.printStackTrace();
			}finally {
				try {
					if(fis!=null) {
					fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	}

}
