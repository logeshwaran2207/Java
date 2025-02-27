package OPPs;

public class Enumeration {
	enum Gamelevel{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String args[]) {
		//assign enum value
		
		Gamelevel a=Gamelevel .HIGH;
		System.out.println(a);
	//enum in switch case
	switch(a) {
	case LOW:
		System.out.println("low");
	break;
	case MEDIUM:
		System.out.println("medium");
	break;
	case HIGH:
		System.out.println("high");
	break;
}
	//enum by loop
	
	for(Gamelevel level:Gamelevel.values()) {
		System.out.println(level);
	}
	}
}
