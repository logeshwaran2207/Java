package afterOPPs;

public class Exception_Handling {
	public static void main(String args[]) {
		int i=4;
		int j=0;
		try {
			 j=i/0;
		}
		catch(Exception e){
			System.out.println(" some thing went worng");
		}
		
		System.out.println(i);
		System.out.println(j);
	}

}
