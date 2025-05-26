package afterOPPs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamm {
	public static void main(String args[]) {
		
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6);
		
		//Stream<Integer>s1=nums.stream();
		//Stream<Integer>s2=s1.filter(n->n%2==0);
		//Stream<Integer>s3=s2.map(n->n*2);
		//s3.forEach(n->System.out.println(n));
		
		
	/*	int result=nums.stream()
				.filter(n->n%2==0)
				.map(n->n*2)
				.reduce(0, (c,e)->c+e);
		
		System.out.println(result); */
		
		Stream<Integer>sortedValues=nums.stream()
				.filter(n->n%2==0)
				.sorted();
		
		sortedValues.forEach(n->System.out.println(n)); 
		        
		
	}

}
