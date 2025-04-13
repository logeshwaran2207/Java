package Problem_on_Number;

public class Perfect_Number {
	public static void main(String args[]) {
		int n=6;
		int a=n;
		int sum=0;
		for (int i=1;i<n;i++) {
			if(n%i==0) {
			sum+=i;
			}
		}
		if(sum==a) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
