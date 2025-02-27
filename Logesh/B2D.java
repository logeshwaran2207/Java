package Logesh;
import java.util.*;
public class B2D {
	public static int b2d(int b){
		int decimal=0, power=0;
		while(b!=0) {
			int rem=b%10;
			decimal+=rem*Math.pow(2,power);
			b=b/10;
			power++;
			
			
			
		}
		return decimal;
		
	}
	
	
	
	
	
	
	public static void main (String args[]) {
		System.out.println(b2d(1100));
		
	}

}
