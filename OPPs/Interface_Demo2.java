package OPPs;
interface interdemo{
	int a=20;
	void fun1();
	void fun2();
	  static void fun3() {
		System.out.println("fun3");
	}
	 default void fun5() {
		 System.out.println("fun5");
	 }
	
	
}
interface interemo1 extends interdemo{
	void fun4();
}
class testinter implements interemo1{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2");
	}

	@Override
	public void fun4() {
		// TODO Auto-generated method stub
		System.out.println("fun4");
	}
	
}

public class Interface_Demo2 {
public static void main(String args[]) {
	testinter o=new testinter();
	//interdemo o1=new interdemo();
	o.fun1();
	o.fun2();
	o.fun4();
	o.fun5();
	
	interdemo.fun3();
	
	
}
}
