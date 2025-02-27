package OPPs;
class Complex{
	int real,img;
	
	public Complex(){
		real=5;
		img=10;
		
	}
	
	public Complex(int x,int y) {
		real=x;
		img=y;
		
	}
	public Complex(Complex o1) {
		this.real=o1.real;
		this.img=o1.img;
		
	}
	
	public String toString() {
		return "("+real+"+"+img+"i)";
	}
}

public class CopyConstructor {
	public static void main (String args[]) {
		Complex o=new Complex();
		System.out.println(o);
		Complex o1=new Complex(2,3);
		System.out.println(o1);
		Complex o2=new Complex(o1);
		System.out.println(o2);
		
	}

		
}
