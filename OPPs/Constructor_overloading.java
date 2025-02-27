package OPPs;
class Box{
	float length,width;
	
	public Box() {
		length=10;
		width=20;
	}
	
	public Box(float x,float y) {
		length=x;
		width=y;
	}
	public Box(float x) {
		length=width=x;
	}
	
	
	float area() {
		return length*width;
	}
	
}
public class Constructor_overloading {
	public static void main(String args[]) {
		Box o=new Box();
		System.out.println(o.area());
		Box o1=new Box(20,30);
		System.out.println(o1.area());
		Box o2=new Box(20);
		System.out.println(o2.area());
		
	}

}
