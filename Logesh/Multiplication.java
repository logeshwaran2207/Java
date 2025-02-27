package Logesh;
import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the table");
		int t=in.nextInt()	;
		System.out.println("enter the limit");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(t+"x"+i+"="+(t*i));
		}
	}
}
