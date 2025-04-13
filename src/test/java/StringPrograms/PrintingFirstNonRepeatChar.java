package StringPrograms;

import java.util.Scanner;

public class PrintingFirstNonRepeatChar {

	public static void main(String[] args) {

		System.out.println("enter text : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		firstNonRepeatCharacter(name);
	}

	private static void firstNonRepeatCharacter(String name) {
		String str = name.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))

			{
				System.out.println("Non repeating character : " + str.charAt(i));
				break;
			}

			if (i == str.length() - 1) {
				System.out.println("There is non repeating character");
			}

		}
	}
}
