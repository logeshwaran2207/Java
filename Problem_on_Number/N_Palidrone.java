package Problem_on_Number;

public class N_Palidrone {
	public static void main(String args[]) {
		
		for(int i=100;i<=500;i++) {
		
			int n=i;
			
		
		int reverse=0,rem;
		int original =n;
		while(n!=0) {
			rem=n%10;
			reverse= reverse*10+rem;
			n/=10;
		}
		if (original==reverse) {
			System.out.println(i+"yes");
		}
		}
		
	/*if (original==reverse) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}*/
		
	}

}
