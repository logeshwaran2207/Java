package Logesh;
import java.util.Scanner;
public class Array1 {
	public static void main(String args[]) {
		int b[]=new int[10];
		for(int i=0;i<10;i++) {
			Scanner in=new Scanner(System.in);
			System.out.println("enter the number"+i);
			b[i]=in.nextInt();
			
			
		}
		for(int name:b) {
			System.out.print(name);
		}
		
		
		
		
		
	}
	

}
