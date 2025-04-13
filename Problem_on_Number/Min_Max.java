package Problem_on_Number;

public class Min_Max {
	public static void main(String args[]) {
		int n=2576;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int d;
		while(n!=0) {
			d=n%10;
			min=Math.min(min, d);
			max=Math.max(max, d);
			n/=10;
			
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
