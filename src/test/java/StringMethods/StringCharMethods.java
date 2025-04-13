package StringMethods;

public class StringCharMethods {

	//printing every letter vertically in console
	public static void main(String[] args) {

		String s = "Hello";

		System.out.println("Length : "+s.length());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("---------------------------------------------------");
		char[] ch = s.toCharArray();
		System.out.println("Length : "+ch.length);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("---------------------------------------------------");
		
		

	}
}
