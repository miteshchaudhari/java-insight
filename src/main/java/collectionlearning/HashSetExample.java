package collectionlearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset = new HashSet<String>();
		myset.add("Sunday");
		myset.add("Monday");
		myset.addAll(myset);
		
		 // Creating an iterator 
        Iterator<String> myvalue = myset.iterator(); 
  
        // Displaying the values after iterating through the set 
        System.out.println("The iterator values are: "); 
        while (myvalue.hasNext()) { 
            System.out.println(myvalue.next()); 
        } 
        
        // using for loop
        for (String s : myset) {
            System.out.println(s);
        }
		
				

	}

}
