package OPPs;
class Rectangles{
	private int length,width;
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

public class GetSet {
	public static void main (String args[]) {
		Rectangles o=new Rectangles();
		o.setlenght(20);
		o.setwidth(20);
		System.out.println(o.area());
		
	}

}
