package afterOPPs;

class l{
	public void show() throws ClassNotFoundException {
		Class.forName("lamda");
	}
}

public class Throws1 {
	public static void main(String args[]) {
		l obj=new l();
		try {
			obj.show();
		}
		catch( ClassNotFoundException e){
			System.out.println("loki");
		}	
	}
}
