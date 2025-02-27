package OPPs;
class Shape{
	float len,bre,rad;
}
class Circle extends Shape{
	public Circle(float x) {
		rad=x;
	}
		float circle_area() {
			return 3.14f*(rad*rad);
		
	}
	
}
class Rect extends Shape{
	public Rect(float y,float z) {
		len=y;
		bre=z;
	}
	float rect_area() {
		return len*bre;
	}
	
}
class Square extends Shape{
	public Square(float y) {
		len=y;
	}
	float Squ_area() {
		return len*len;
	}

	
	
}


public class Inheritance_Hierarchical {
	public static void main(String args[]) {
		Square o=new Square(5);
		Rect o1=new Rect(5,5);
		Circle o2=new Circle(5);
		System.out.println(o.Squ_area());
		System.out.println(o1.rect_area());
		System.out.println(o2.circle_area());
	
	}
	

}
