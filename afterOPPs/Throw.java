package afterOPPs;

public class Throw {
	public static void main(String args[]) {
		int i=4;
		int j=0;

		try {
			 j=18/20;
			 if(j==0)
			throw new ArithmeticException("i dont want print 0") ;
		}
		catch(ArithmeticException e){
			System.out.println(" some thing went worng"+e);
		}
		
		catch(Exception e) {
			System.out.println("loki"+e);
		}
		
		System.out.println(i);
		System.out.println(j);
	}
	

}
