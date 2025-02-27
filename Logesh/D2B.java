package Logesh;
import java.util.*;
public class D2B {
	public static void d2b(int n) {
		int b[]=new int[1000];
		int i=0;
		while(0<n) {
			b[i]=n%2;
			n=n/2;
			i++;
			
		}
		 for(int j=i-1;j>=0;j--) {
			 System.out.print(b[j]);
		 }
		
		
		
	}
	
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number ");
		int n =in.nextInt();
		System.out.println();
		d2b(n);
		
		
	}

}
