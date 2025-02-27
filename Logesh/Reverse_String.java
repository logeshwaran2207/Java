package Logesh;
import java.util.*;
public class Reverse_String {
	public static void main(String args[]) {
		StringBuffer a= new StringBuffer("Logesh is a software developer");
		StringBuffer b= new StringBuffer();
		for(int i=a.length()-1;i>=0;i--) {
			b.append(a.charAt(i));
		}
		System.out.println(b);
	}
	
}
