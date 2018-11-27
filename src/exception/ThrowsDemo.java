package exception;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 派生类在继承超类时会重写其方法，那么在重写超类
 * 中含有throws声明异常抛出的方法时，对throws
 * 重写规则。
 */
public class ThrowsDemo {
	public void dosome()
		throws IOException,AWTException{
		
	}

}
class Son extends ThrowsDemo{ 
	//public void dosome()
	//throws IOException,AWTException{
		
	//}
	//可以不再抛出任何异常
	//public void dosome() {
		
	//}
	//可以仅抛出父类方法抛出的部分异常
	//public void dosome()
	//		throws IOException{
		
	//}
	//可以抛出父类方法抛出异常的子类型异常
	//public void dosome()
	//		throws FileNotFoundException{
			
	//}
	//不允许抛出额外异常
	//public void dosome()
	//		throws SQLException{
			
	//}
	//不允许抛出父类方法抛出异常的父类型异常
		//public void dosome()
		//		throws  Exception{
				
		//}
	
	
		
	
}