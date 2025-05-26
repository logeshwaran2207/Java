package afterOPPs;
@FunctionalInterface
interface A{
	public void show();
	
}

public class Lambda {
	
	public static void main(String args[]) {
		A obj= ()->System.out.println("loki");
		
		obj.show();
	}
}