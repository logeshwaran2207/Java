package OPPs;
interface Animal{
	void sound();
	void sleep();
	
}
class Dog implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("wooo");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}
	
}

public class Interface_Demo {
public static void main(String args[]) {
	Dog o=new Dog();
	o.sleep();
	o.sound();
	
}
}
