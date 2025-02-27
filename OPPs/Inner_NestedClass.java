package OPPs;
class outer{
	int a=50;
	class inner{
		int b=25;
		void innerdisplay() {
			System.out.println(a);
			System.out.println(b);
			
		}
	}
	void outerdisplay() {
	 inner i=new inner();
	 i.innerdisplay();
	 System.out.println(i.b);
	}
}
public class Inner_NestedClass {
public static void main(String args[]) {
	outer o=new outer();
	o.outerdisplay();
	outer.inner i=new outer().new inner();
	i.innerdisplay();
}
}