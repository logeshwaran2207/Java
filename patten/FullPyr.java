package patten;

public class FullPyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=6;
	for(int i=0;i<n;i++) {
		for(int j=n-i;j>1;j--) {
			System.out.print(" ");//all in one
		}
		
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println("");
	}
	
	
	
	}
	
}
