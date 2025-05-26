package afterOPPs;

class P extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}
}

class L extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("Helllo");
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}
}


public class Thread_priority {
	public static void main(String args[]) {
		P obj=new P();
		L obj1 =new L();
		
		obj.start();
		obj1.start();
		
	}


}
