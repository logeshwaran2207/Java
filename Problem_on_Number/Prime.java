package Problem_on_Number;

public class Prime {
	public static void main(String args[]) {
		/*int n=3;
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			f++;	
			}
		}
	if(f==2) {
		System.out.println("prime");
	}
	else {
		System.out.println("not");
	}*/
		int f=0;
	for(int n=1;n<=999;n++) {
		for(int i=1;i<=999;i++) {
		if(n%i==0) {	
			f++;
		}
		}
        if(f==2) {
			System.out.println(n);
		}
         f=0;
		
	}
		
	}
}
