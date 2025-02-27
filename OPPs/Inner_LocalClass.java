package OPPs;
class outercls{
	void display() {
		class Inner{
			void Innerdisplay() {
				System.out.println("loki");
			}
		}
		Inner i=new Inner();
		i.Innerdisplay();
	}
	}
	

public class Inner_LocalClass {
public static void main(String args[]) {
	outercls o=new outercls();
	o.display();
	
}
}
