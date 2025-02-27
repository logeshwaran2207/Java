package Logesh;
import java.util.*;
public class JaggedArrayFor {
	public static void main(String args[]) {
		int a[][]= {{5,5,5,5},{4,4,4},{6,6,6,6}};
		for(int k[]:a) {
			for(int l:k) {
				System.out.print(l);
				
			}
			System.out.println("  ");
			
		}
	}

}