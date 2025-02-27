package Logesh;
import java.util.*;
public class ToggleCase{
	public static void main(String args[]) {
		StringBuffer a=new StringBuffer("Loki Logesh Waran");
		System.out.println(a);
		
		for(int i=0;i<a.length();i++) {
		if(a.charAt(i)>=65&&a.charAt(i)<=90) {
			int c=(char)a.charAt(i)+32;
			a.setCharAt(i,(char)c);
			
		}
		else if(a.charAt(i)>=97 && a.charAt(i)<=122 ) {
				int c=(int)a.charAt(i)-32;
				a.setCharAt(i, (char)c);
				
			}
			
		
		
		
		
		}
		System.out.println(a);
	}
}
