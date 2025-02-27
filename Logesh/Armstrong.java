package Logesh;
import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
	int d1,d2,d3,result,temp,number;
	for(int i=100;i<=999;i++)
	{
	    temp=i;
		d1=temp%10;
		temp=temp/10;
		d2=temp%10;
		temp=temp/10;
		d3=temp%10;
	  result=((d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3));
		
		if(i==result) {
			System.out.println(i);}
		
		
	}
		
	}

}
