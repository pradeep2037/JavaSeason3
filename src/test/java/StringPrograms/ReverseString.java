package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("enter name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		reverseOfString(name);
	}

	private static void reverseOfString(String string) {

		String rev = "";
		for (int i = string.length()-1;i>=0;i--) {
			rev = rev+string.charAt(i);
		}
		
		System.out.println(rev);

		
		if(string.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
