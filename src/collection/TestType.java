package collection;

public class TestType {
	public static void main(String[] args) {
		Type<Integer> t = new Type<Integer>(1,2);
		t.setX(1);
		int x = t.getX();
		
		Type<Double> t2 = new Type<Double>(1.2,2.2);
		t2.setX(2.2);
		double x2 = t2.getX();
		
		
		Type<String> t3 = new Type<String>("一","二");
		t3.setX("二");
		String x3 = t3.getX();
		
		
	}
}
