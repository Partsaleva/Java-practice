package changeObject;

public class TestChangeObject {

	public static void main(String[] args) {
		TestChangeObject o=new TestChangeObject(1, 2);
		changeField(o);
		System.out.println(o);

	}

	private int a;
	private int b;
	
	
	//private final int a;
	//private final int b;
	
	
	public TestChangeObject(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public static void changeField(TestChangeObject obj){
		obj.a=3;
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return "TestChangeObject [a=" + a + ", b=" + b + "]";
	}
	
	
}
