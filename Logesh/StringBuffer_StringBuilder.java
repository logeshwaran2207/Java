package Logesh;
import java.util.*;
public class StringBuffer_StringBuilder {
	public static void main(String args[]) {
		StringBuffer buffer=new StringBuffer("Logesh");
		System.out.println(buffer);
		buffer.append(" Loki");
		System.out.println(buffer);
		buffer.insert(11," k");
		System.out.println(buffer);
		buffer.replace(6, 7,"xxx");
		System.out.println(buffer);
		buffer.delete(6, 9);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		
		
		
		
	}

}
