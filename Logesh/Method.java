package Logesh;


class Function{
	public void add() {
		int a=2;
		int b=2;
		System.out.println(a+b);
	}
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
	
	public int mul() {
		int a=2;
		int b=2;
		return a*b;
	}
	
	public int div(int x,int y) {
		return x/y;
	}
	
	
}

public class Method {
	public static void main(String aargs[]) {
		Function a=new Function();
		a.add();
		System.out.println(a.mul());
		a.sub(4, 5);
		System.out.println(a.div(4, 2));
		
		
	}

}
