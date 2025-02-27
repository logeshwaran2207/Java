package OPPs;
abstract class Mobile{
	void voicecall(){
		System.out.println("you can make voiice call");
	}
	abstract void display();
	abstract void camera();
}
class samsung extends Mobile{
	void display() {
		System.out.println("14 inches");
	}
	void camera() {
		System.out.println("64");
	}
}
class nokia extends Mobile{
	void display() {
		System.out.println("12 inches");
	}
	void camera() {
		System.out.println("32");
	}
}
public class Abstract_Demo1 {
	public static void main(String args[]) {
	 samsung o=new samsung();
	 o.voicecall();
	 o.camera();
	 o.display();
	System.out.println("----------------");	
	
	nokia o1=new nokia();
	o1.voicecall();
	o1.camera();
	o1.display();
	}

}
