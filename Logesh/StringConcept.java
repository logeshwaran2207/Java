package Logesh;
import java.util.*;
public class StringConcept {
	public static void main(String args[]) {
		String a="Logesh Loki";
		String b="Logesh Loki";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace("Loki","loki"));
		System.out.println(a.contains("loki"));
		System.out.println(a.isEmpty());
		System.out.println(a.toUpperCase());
		System.out.println(a.endsWith("ki"));
		System.out.println(a.startsWith("Lo"));
		System.out.println(a.substring(5));
		System.out.println(a.substring(0,5));
		//System.out.println();
		char[] kk=a.toCharArray();
		for(char l:kk) {
			System.out.println(l);
			
		}
		
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.trim().length());
		
		
	}

}
