package afterOPPs;

public class Exception_Multiple {
	public static void main(String args[]) {
		int i=4;
		int j=0;
		
		String name=null;
		
		int num[]=new int [5];
		try {
			 j=0/4;
			 System.out.println(name.length());
			 System.out.println(num[1]);
			 System.out.println(num[5]);
			 
			 
		}
		catch(ArithmeticException e){
			System.out.println(" some thing went worng");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stay in bound");
		}
		catch(Exception e) {
			System.out.println("loki"+e);
		}
		
		System.out.println(i);
		System.out.println(j);
	}

}
