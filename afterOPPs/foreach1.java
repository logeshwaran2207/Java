package afterOPPs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreach1 {
	public static void main(String args[]) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5);
		
		//nums.forEach(n->System.out.println(n));//Lambda
		
		Consumer<Integer>con=new Consumer<Integer>()
				{

					@Override
					public void accept(Integer n) {
						// TODO Auto-generated method stub
						System.out.println(n);
					}		
			
				};
				nums.forEach(con);
	}

}
