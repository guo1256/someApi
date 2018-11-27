package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用含有参数的方法
 * @author soft01
 *
 */
public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//加载类
		Class cls = Class.forName("reflect.Person");
		//实例化
		Object o = cls.newInstance();
		//获取方法
		Method method =cls.getDeclaredMethod(
			"sayHello", new Class[] {String.class,int.class}
		);
		method.invoke(
			o, new Object[] {"传奇",23}
		);
	}
}
