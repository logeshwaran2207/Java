package OPPs;
class Rectangless{
	private int length,width;
	
	public Rectangless(){
		 length=10;
		 width=20;
	}
	//Getter
	int getlength() {
		return length;
	}
	
	int getwidth() {
		return width;
	}
	//Setter
	void  setlenght(int l) {
		length=l;
		
	}
	void setwidth(int w) {
		width=w;
	}
	
	int area() {
		int a=length*width;
		return a;
	}
	
	
}

public class Constructor {
	public static void main (String args[]) {
		Rectangless o=new Rectangless();
		//o.setlenght(20);
		//o.setwidth(20);
		System.out.println(o.area());
		
	}

}