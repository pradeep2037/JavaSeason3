package StringMethods;

public class StringCheckMethods {

	public static void main(String[] args) {
		
		String s1 = "FLM";
		
		String s2 = "flm";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "new FLM";
		System.out.println(s3.contains(s1));
		
		System.out.println(s3.startsWith("new"));
		
		System.out.println(s3.endsWith(s1));
		System.out.println(s3.startsWith(s1,4));
	}
}
