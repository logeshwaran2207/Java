package Problem_on_Number;

import java.util.Scanner;

public class Armstrong_N {
	public static void main(String []args) {
		for(int i=100;i<=999;i++) {
		int n=i;
		int temp=n;
		int d1,d2,d3;
		d1=temp%10;
		temp=temp/10;
		d2=temp%10;
		temp=temp/10;
		d3=temp%10;
		int reverse=((d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3));
		
		if(n==reverse) {
			System.out.println(i);}
		

}}

}
