package Problem_on_Number;

public class Sum_Natural {
	public static void main(String args[]) {
		solve(5);
		solve(6);
		
	}
	public static void solve(int n) {
		int sum=0;
		/*for(int i=1;i<n;i++) {
			sum+=i;
		}*/
		sum=n*(n+1)/2;
		System.out.println( sum);
	}

}
