package OPPs;
class StaticTest{
	static int a=10;
	int b=20;
	void show() {
		System.out.println("A:"+a+"|B:"+b);
	}
	static void display() {
		System.out.println("A:"+a);
	}
}
public class Static_Variable {
	public static void main(String args[]) {
		StaticTest o=new StaticTest();
		o.show();
		StaticTest o1=new StaticTest();
		o1.b=100;
		o1.show();
		StaticTest.a=200;
		o1.show();
		o.show();
	}

}
