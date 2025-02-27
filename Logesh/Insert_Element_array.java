package Logesh;
import java.util.*;
public class Insert_Element_array {
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int index=3;
		int value=33;
		
	System.out.println(Arrays.toString(a));
	for(int i=a.length-1;i>index;i--) {
		a[i]=a[i-1];
		
	}
	a[index]=value;
	System.out.println(Arrays.toString(a));
	
	}

}
