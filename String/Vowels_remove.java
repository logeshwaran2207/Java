package String;

public class Vowels_remove {
	public static void main(String args[]) {
		String a="lokiddhkdbjcbjbjssaaaa";
		String s1="";
		s1=a.replaceAll("[aeiou]", "");
		System.out.println(s1);
	}

}
