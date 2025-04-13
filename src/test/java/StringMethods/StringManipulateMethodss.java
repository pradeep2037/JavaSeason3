package StringMethods;

public class StringManipulateMethodss {

	public static void main(String[] args) {
		
		String s = "        Frontlines Media";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("----------------------------------------------------------------");
		String s1 = "chrome";
		System.out.println(s1.toUpperCase());
		System.out.println("----------------------------------------------------------------");
		String s2 = "CHROME";
		System.out.println(s2.toLowerCase());
		System.out.println("----------------------------------------------------------------");
		String a = "bat";
		String b = "man";
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println("----------------------------------------------------------------");
		System.out.println(s1.replace("c", "w"));
		System.out.println("----------------------------------------------------------------");
		String c = "Frontlines Media";
		System.out.println(c.substring(8));
		System.out.println(c.substring(15));
		System.out.println(c.substring(5,10));



	}
}
