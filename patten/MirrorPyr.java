package patten;

public class MirrorPyr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=6;
	int num=1;
	for(int i=1;i<=n;i++) {
		for(int j=n-i;j>0;j--) {
			System.out.print(" ");//all in one
		}
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			num++;
		}
		
		System.out.println("");
	}
	
	for(int i=n;i>=1;i--) {
		for(int j=n-i;j>0;j--) {
			System.out.print(" ");//all in one
		}
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		
		System.out.println("");
	}
	
	}

}
