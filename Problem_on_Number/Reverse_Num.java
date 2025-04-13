package Problem_on_Number;

public class Reverse_Num {
	public static void main(String args[]) {
		int n=5678;
		int reverse=0;
		int rem;
		while(n!=0) {
		  rem=n%10;
		  reverse=reverse*10+rem;
		  n/=10;
		}
	System.out.println(reverse);
	}

}
