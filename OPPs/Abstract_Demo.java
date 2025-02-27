package OPPs;

abstract class shape{
	abstract void display();
	
	void message() {
		System.out.println("message from shape");
	}
}
class Pentagon extends shape{
	void display() {
		System.out.println("message grom pentagon");
	}
	
}


class Abstract_Demo {
	public static void main(String args[]) {
		Pentagon o=new Pentagon();
		o.display();
		o.message();
		
	}

}
