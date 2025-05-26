package afterOPPs;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
	public static void main(String args[]) {
		Map<String,Integer>students=new HashMap<>();
	    students.put("Logesh", 55);
	    students.put("loki", 95);
	    students.put("lw", 58);
	    
	    System.out.println(students.keySet());
	    for(String key:students.keySet()) {
	    	System.out.println(key+"="+students.get(key));
	    }
	    
	}

}
