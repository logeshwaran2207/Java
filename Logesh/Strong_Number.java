package Logesh;
import java.util.Scanner;
public class Strong_Number {
	public static void main(String args[]) {
		int num,original,rem,f,sum=0;
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		
		original=num;
		while(num>0)
			
		{
			rem=num%10;
			f=1;
			
			for(int i=1;i<=rem;i++) {
				f*=i;
				
			}
			sum+=f;
			num=num/10;
			
		}
		if(sum==original) {
			System.out.println("strong");
			
		}
		else {
			System.out.println("not a strong");
		}
		
	}
	

}
