package collectionlearning;

import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(123);
		ar1.add(345);
		
		System.out.println(ar1);
		ar1.add(567);
		ar1.add(765);
		
		System.out.println(ar1);
		ar1.add(2, 222);
		System.out.println(ar1);

	}

}
