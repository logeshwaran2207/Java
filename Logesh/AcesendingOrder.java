package Logesh;
import java.util.*;
public class AcesendingOrder {
	public static void main(String args[]) {
		
		int a[]= {55,22,33,77,66};
		System.out.println("befoe"+Arrays.toString(a));
		
		int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) 
			//if(a[i]<a[j]) //descending order
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
		
		
		}
	
		System.out.println("after"+(a));
	}

}
