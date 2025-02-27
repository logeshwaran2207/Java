package OPPs;
class Student{
	public int roll_no;
	public String name;
	Student(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
	
	void print(){
		System.out.println("Roll No"+roll_no);
		System.out.println("Name"+name);
		System.out.println("__________________");
	}
		
	
}
public class ArrayObject {
	public static void main(String args[]) {
		/*Student o=new Student(10,"LOGESH");
		o.print();
		Student o1=new Student(22,"LOki");
		o.print();*/
		Student[]o;
		o= new Student[5];
		o[0]=new Student(1,"lgesg");
		o[1]=new Student(2,"l0esg");
		o[2]=new Student(3,"logsg");
		o[3]=new Student(4,"logeg");
		o[4]=new Student(4,"loges");
		for(int i=0;i<o.length;i++) {
		o[i].print();
		}
		
	}
}
