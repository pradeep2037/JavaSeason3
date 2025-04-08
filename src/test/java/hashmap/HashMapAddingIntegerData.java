package hashmap;

import java.util.HashMap;

public class HashMapAddingIntegerData {

	//size = no of key : value pairs
	//capacity = 16
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		System.out.println("Size : "+hashMap.size());
//		===========================================================================
		hashMap.put(100, "Ravi");
		hashMap.put(101, "Ram");
		hashMap.put(102, "Gopi");
		hashMap.put(103, "Sai");
		
		System.out.println("Size : "+hashMap.size());
		
		System.out.println(hashMap);
		
		
		
	}
}
