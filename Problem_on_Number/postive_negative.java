package Problem_on_Number;

import java.util.Scanner;

public class postive_negative {
	public static void main(String args[]) {
		System.out.println("enter the limit");
		int e=0,o=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the value"+i);
			a[i]=in.nextInt();
				
			}
		for(int element:a) {
			if(element>0) {
				e++;
			}
			else {
				o++;
			}
		}

		System.out.println(e);
		System.out.println(o);
}
}