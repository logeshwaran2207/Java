package afterOPPs;

import java.util.Arrays;
import java.util.List;

public class foreach {
	public static void main(String args[]) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5);
		
		nums.forEach(n->System.out.println(n));//Lambda
		
	}

}
