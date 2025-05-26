package afterOPPs;

class M extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("Hi");
	    }
	}
}

class N extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("Helllo");
	    }
	}
}

public class Multiple_threading {
	public static void main(String args[]) {
		M obj=new M();
		N obj1 =new N();	
		obj.start();
		obj1.start();		
	}
}
