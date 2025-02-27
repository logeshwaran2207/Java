package Logesh;
import java.util.Scanner;

public class Armstrong_number{
	public static void main(String []args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int temp=n;
		int d1,d2,d3;
		d1=temp%10;
		temp=temp/10;
		d2=temp%10;
		temp=temp/10;
		d3=temp%10;
		int reverse=((d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3));
		
		if(n==reverse) {
			System.out.println("yes");}
		
			else {System.out.println("no");
		}
				
		
		
	
	}

}