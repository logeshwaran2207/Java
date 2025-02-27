package OPPs;

class demo{
	private int m,n;
	demo(int x,int y){
		m=x;
		n=y;
	}
	int largest (){if(m>n) 
		return m;
	else 
		return n;}
	void display() {
		int large =largest();
		System.out.println("gretest no is"+large);
		
	}
}
public class NestedMethod {
	public static void main(String args[]) {
		demo o=new demo(12,23);
		o.display();
	}

}
