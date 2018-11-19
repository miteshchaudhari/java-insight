package collectionlearning;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mymap = new HashMap<>();
		
		mymap.put( "Sunday",11);
		mymap.put( "Monday",12);
		mymap.put( "Tuesday",13);
		
		for (Entry<String, Integer> e : mymap.entrySet()) {
			System.out.println(e.getKey() + "#" + e.getValue());
		}
		
		

	}

}
