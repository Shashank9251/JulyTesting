package jul5_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "");
		ht.put(4, "a");
		ht.put(5, "a");
		ht.put(3, "two");
		//ht.put(3, null); // it will throw an error because it cannot store the null value
		//ht.put(null, ""); // it will throw an error because it cannot store the null key
		System.out.println(ht);
		
			
		
	}

	}



