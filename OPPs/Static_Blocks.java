package OPPs;
class Blocks{
	static {
		System.out.println("Block 3");
	}
	static {
		System.out.println("Block 4");
	}
}
public class Static_Blocks {
	static {
		System.out.println("Block 1");
	}
	
public static void main(String args[]) {
	Blocks o=new Blocks();
	System.out.println("Main ");
	//Blocks o=new Blocks();
}
static {
	System.out.println("Block 2");
}

}
