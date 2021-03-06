package collection;
/**
 * 使用当前类作为集合元素，测试集合操作元素的相关
 * 方法
 * @author adminitartor
 *
 */
public class Point implements Comparable<Point>{
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
	
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
	public String toString(){
		return "("+x+","+y+")";				
	}

	/**
	 * 当一个类实现了Comparable接口后，要求必须重写
	 * 抽象方法compareTo,该方法的意义在于定义当前对
	 * 象this与方法给定参数对象o的大小关系。
	 * 该方法返回一个int值，用于表示比较结果。该值不
	 * 关注具体取值，只关注取值范围。
	 * 当返回值>0时:表示当前对象this大于参数对象o
	 * 当返回值<0时:this<o
	 * 当返回值=0时:this与o相等
	 * 
	 */
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}

	
}












