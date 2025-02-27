package Logesh;
import java.util.*;
public class JaggedArray {
	public static void main(String args[]) {
		int a[][]= {{5,5,5,5},{4,4,4},{6,6,6,6}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j ]);
			}
			System.out.println("     ");
		}
	}

}