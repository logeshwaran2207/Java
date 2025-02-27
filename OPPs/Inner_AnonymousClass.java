package OPPs;
abstract class anony{
	abstract void display();
}
class mous{
	void mousdisplay() {
		anony i=new anony() {

			@Override
			void display() {
				// TODO Auto-generated method stub
				System.out.println("loki");
			}
		};	
		i.display();
	}
	
}

public class Inner_AnonymousClass {
	public static void main(String args[]) {
		mous o=new mous();
		o.mousdisplay();
	}

}
