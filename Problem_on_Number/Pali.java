package Problem_on_Number;

public class Pali {
public static void main(String args[]) {
	int n=121, reverse=0,rem;
	int original =n;
	while(n!=0) {
		rem=n%10;
		reverse= reverse*10+rem;
		n/=10;
	}
	
if (original==reverse) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
	
}
}
