package OPPs;
class fin{
	final int MIN=10;
	final int NORMAL;
	final int MAX;
	fin(int normal){
		NORMAL=normal;
		MAX=20;

	}
	void display() {
		System.out.println(MIN);
		System.out.println(NORMAL);
		System.out.println(MAX);
		
	}
}

public class Final_Variable {
	public static void main(String args[])
	{
		fin o=new fin(30);
		o.display();
	//	o.MIN=20;
	}
}
