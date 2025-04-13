package Problem_on_Number;

public class AP_Series {
	public static void main(String args[]) {
		int a=2,c=2,n=4;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=a;
			a+=c;
		}
		System.out.println(sum);
	}

}
