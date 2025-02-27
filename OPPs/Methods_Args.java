package OPPs;

public class Methods_Args {
	
	public static void getnames(String...names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
	public static void main(String args[]) {
		getnames("loki","lokii","lokiii","lokiiii");
	}

}
