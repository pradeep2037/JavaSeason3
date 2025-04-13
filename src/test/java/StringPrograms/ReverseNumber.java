package StringPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	static int rev = 0;

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		//to scan input from console
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverseOfNumber(num);

	}
	
	

	private static void reverseOfNumber(int num) {
		
		while(num>0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}
		
		System.out.println(rev);
	}
}
