
public class OtherClass {

	public static void main(String[] args) {
		TestChangeObject o=new TestChangeObject(1, 2);
		changeField(o);
		System.out.println(o);

	}

	public static void changeField(TestChangeObject obj){
		int a=3;
		//not the same object
		obj=new TestChangeObject(a, obj.getB());
		System.out.println(obj);
	}
}