package OPPs;
class Father{
	public void house() {
		System.out.println("have own house");
	}
}
class Son extends Father{
	public void car() {
		System.out.println("have own car");
	}
	
}
public class Inheritance_Single{
	public static void main(String args[]) {
		Son o=new Son();
		o.car();
		o.house();
	}

}