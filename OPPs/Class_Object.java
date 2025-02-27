package OPPs;


class Rectangle{
          int a,b;
          
         
          void getdetails(int x,int y) {
        	  a=x;
        	  b=y;
          }
          
          int area() {
        	  int c=a*b;
        	  return c;
          }


}

public class Class_Object {
	public static void main (String args[]) {
		Rectangle o=new Rectangle();
		o.a=10;
		o.b=20;
		System.out.println(o.area());
		Rectangle o1=new Rectangle();
		o1.getdetails(20,30);
		System.out.println(o1.area());
		
		
		
		
		
		
	}

}
