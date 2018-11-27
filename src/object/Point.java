package object;

/**
 * 使用该类测试重写Object相关方法的原则
 * 
 * 该类表示直角坐标系中的一个点
 * 
 * @author soft01
 *
 */
public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 通常我们定义类在使用toString方法时就应当 重写这个方法。 返回的字符串格式没有具体要求，但是原则上返回的字符串应当 包含当前对象中的属性信息。
	 * 
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	/**
	 * equals的设计目的是比较两个对象内容是否相同 这里指的是当前对象“this”和参数对象obj的内容是否 相同。
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}

}
