package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapFetchingEntries {

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
//		===========================================================================

		Set<Entry<Integer, String>> entries = hashMap.entrySet();
		
		for (Entry<Integer, String> entry : entries) {
			System.out.println( entry.getKey() + " is "+entry.getValue());
		}
	}
}
