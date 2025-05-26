package afterOPPs;

class O implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}
}

class Q implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
		System.out.println("Helllo");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}
}

public class Runable_Thread {
	public static void main(String args[]) {
		Runnable obj=new O();
		Runnable obj1 =new Q();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();
		
	}

}
