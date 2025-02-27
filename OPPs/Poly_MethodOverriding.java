package OPPs;
class User{
	String name;
	int age;
	User(String n,int a){
		name=n;
		age=a;
	}
	public void display() { 
		System.out.println("name"+name);
		System.out.println("age"+age);
	}
	
	}
class MainProgrammer extends User{
	String companyname;
	MainProgrammer(String n,int a,String x){
		super(n,a);
		companyname=x;
	}
	public void display() { 
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("companyname"+companyname);
	}
	
}

public class Poly_MethodOverriding {
	public static void main(String args[]) {
		MainProgrammer o=new MainProgrammer("logesh",21,"loki");
		o.display();
		
	}
	

}
