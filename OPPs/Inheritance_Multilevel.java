package OPPs;
class grandfather{
	public void house() {
		System.out.println("have own house");
	}
}
class father extends grandfather{
	public void car() {
		System.out.println("have own car");
	}
	
}
class son extends father{
	public void bike() {
		System.out.println("have a bike");
	}
}

public class Inheritance_Multilevel {
	public static void main(String args[]) {
		son o=new son();
		o.house();
		o.car();
		o.bike();
	}

}
