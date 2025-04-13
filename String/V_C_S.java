package String;

public class V_C_S {
	public static void main(String args[]) {
		String a="loki knc vncnuvnjx";
		int v=0;
		int c=0;
		int s=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			        v++;
			      else if (ch >= 'a' && ch <= 'z')
			        c++;
			      else if (ch == ' ')
			        s++;
			
		}
		System.out.println(v);
		System.out.println(c);
		System.out.println(s);
		
	}

}
