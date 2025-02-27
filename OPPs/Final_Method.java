package OPPs;
class Super{
	void display() {
		System.out.println("display");
	}
	final void finaldisplay() {
		System.out.println("finaldisplay");
	}
	
}
class sub extends Super{
	void display() {
		System.out.println("sub display");
	}
}

public class Final_Method {
public static void main(String args[]) {
	sub o=new sub();
	o.display();
	o.finaldisplay();
	
}
}
