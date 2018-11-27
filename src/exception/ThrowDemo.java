package exception;
//测试抛异常
public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		Person p = new Person();
		try {
			/*
			 * 当调用一个含有throw声明异常抛出的方法时
			 * ，编译器要求必须处理这个异常
			 * 而处理方式有两种：
			 * 1.使用try-catch处理该异常
			 * 2.在当前方法上继续声明throws将该异常抛出
			 * 具体如何处理，结合实际业务
			 */
			p.setAge(10);
		} catch (IllegalAgeException e) {
			
			e.printStackTrace();
		}
			System.out.println("此人年龄"+p.getAge());
			System.out.println("程序结束");

	}

}
