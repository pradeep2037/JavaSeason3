package hashmap;

import java.util.HashMap;

public class HashMapAddingStringData {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		System.out.println("Size : "+hashMap.size());
//		===========================================================================
		hashMap.put("Manager", "Ravi");
		hashMap.put("Developer", "Ram");
		hashMap.put("Tester", "Gopi");
		hashMap.put("TestLead", "Sai");
		
		System.out.println("Size : "+hashMap.size());
		
		System.out.println(hashMap);
	}
}
