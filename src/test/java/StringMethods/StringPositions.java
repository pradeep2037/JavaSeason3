package StringMethods;

import org.apache.tools.ant.taskdefs.Length;

public class StringPositions {

	public static void main(String[] args) {
		
		String s1 = "Frontlines Media";
		
		System.out.println("Length "+s1.length());
		System.out.println("Index M Starting Position "+s1.indexOf("M"));
		System.out.println("Index M Starting Position "+s1.indexOf("Media"));
		System.out.println(s1.lastIndexOf("i"));
	}
}
