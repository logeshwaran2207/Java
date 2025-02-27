package OPPs;



class MathOperation{
	public static int multiply (int a,int b) {
		return a*b;	
	}
	public static double multiply(double x,double y) {
		return x*y;
	}
	public static double multiply(double i,int j) {
		return i*j;
	}
	public static int multiply(int r) {
		return r*r;
	}
	}

public class Poly_MethodOverloading {
	public static void main(String args[]) {
		System.out.println(MathOperation.multiply(5, 5));
		System.out.println(MathOperation.multiply(2.5, 2.5));
		System.out.println(MathOperation.multiply(2.5, 5));
		System.out.println(MathOperation.multiply(5));
	}

}
