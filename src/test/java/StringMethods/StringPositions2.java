package StringMethods;

public class StringPositions2 {

	public static void main(String[] args) {

		String s1 = "Frontlines Media";
		String s2 = "FLM";
		String s3 = "flm";

		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareToIgnoreCase(s3));
	}
}
