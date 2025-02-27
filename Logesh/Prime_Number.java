package Logesh;
import java.util.Scanner;
public class Prime_Number {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int f=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0){
				f++;	
			}
			
		}
		if(f==2) {
			System.out.println("primr");
		}
		else {
			System.out.println("not a prime");
		}
	}
}
