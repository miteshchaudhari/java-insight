package collectionlearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;



public class MapInsideMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> myaccount = new HashMap<String,Integer>();
		Map<String,Integer> myacc;
		myaccount.put("A1",11);
		myaccount.put("A2",22);
		
		System.out.println(myaccount.get("A1"));
		
		for (String key : myaccount.keySet()) {
			   System.out.println("------------------------------------------------");
			   System.out.println("Iterating or looping map using java5 foreach loop");
			   System.out.println("key: " + key + " value: " + myaccount.get(key));
			}
		
		Set<Map.Entry<String, Integer>> entrySet1 = myaccount.entrySet();
		Iterator<Entry<String, Integer>> entrySetIterator = entrySet1.iterator();
		while (entrySetIterator.hasNext()) {
		   System.out.println("------------------------------------------------");
		   System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
		   Entry<String, Integer> entry = entrySetIterator.next();
		   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}





			
	}
}
