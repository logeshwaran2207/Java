package Problem_on_Number;

public class Fibonacci {
	public static void main(String args[]) {
		
		int n=5;
		int a=-1,b=1,c=0;
		
		for(int i=0;i<n;i++) {
			c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		}
		
	}

}
