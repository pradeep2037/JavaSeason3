package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceofElement {

	public static void main(String[] args) {
		

		System.out.println("enter text : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		occuranceOfElement(name);
	}

	private static void occuranceOfElement(String string) {
		
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		char[] str = string.toCharArray();
		
		for (char c : str) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}
			else {
				hmap.put(c, 1);
			}
		}
		System.out.println(hmap);
		System.out.println("--------------------------------------------");
		Set<Entry<Character, Integer>> entries = hmap.entrySet();
		
		for (Entry<Character, Integer> entry : entries) {
			
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}
}
