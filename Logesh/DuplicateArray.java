package Logesh;
import java.util.*;
public class DuplicateArray{
	public static void main(String args[]) {
	  int a[]= {4,5,5,6,6,7};
	  
	 for(int i=0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if((a[i]==a[j]) && (i!=j)){
				 System.out.println("duplicate value"+a[j]);
			 }
		 }
	 }
	  }
}
