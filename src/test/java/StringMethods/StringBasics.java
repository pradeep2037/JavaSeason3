package StringMethods;

public class StringBasics {

	public static void main(String[] args) {
		
		//using laterals
		String s1 = "FLM";                  //store in scpa
		String s2 = "FLM";
		
		String s3 = new String("FLM");      //store in heap area
		
		System.out.println(s1==s2);         //it is used to check for references
		
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));   //it is used to check for content
		
		System.out.println(s1.equals(s3));

	}
}
