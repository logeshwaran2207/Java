package Logesh;
import java.util.*;
public class LowerCase {
	public static void main(String args[]) {
		StringBuffer a=new StringBuffer("LOge");
		System.out.println(a);
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=65&&a.charAt(i)<=90) {
				int c=(char)a.charAt(i)+32;
				a.setCharAt(i,(char)c);
				
			}
		}
		System.out.println(a);
		
	}
}
