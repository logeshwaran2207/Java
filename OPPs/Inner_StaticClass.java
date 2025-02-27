package OPPs;
class sta{
	 static int x=10;
	int y=20;
	 static class tic{
		void display() {
			System.out.println(x);
		}
		
	}
}
public class Inner_StaticClass {
	public static void main(String args[]) {
		sta.tic i=new sta.tic();
		i.display();
	}

}
