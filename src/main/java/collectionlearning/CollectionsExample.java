package collectionlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
   public static void main(String[] args) {
      String[] a = new String[]{"apple", "orange", "banana", "kiwi", "banana", "grape"};
      List<String> l = new ArrayList<String>();
      Collections.addAll(l, a);
      System.out.println(l);
      
      System.out.println(Collections.frequency(l, "banana"));
      System.out.println(Collections.min(l));
      System.out.println(Collections.max(l));
      Collections.swap(l,0,2);
      System.out.println(l);
      Collections.reverse(l);
      System.out.println(l);
      Collections.sort(l);
      System.out.println(l);
      
     
   }
}
