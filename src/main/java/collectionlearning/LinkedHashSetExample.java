package collectionlearning;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
   public static void main(String[] args) {
      LinkedHashSet<String> s = new LinkedHashSet<String>();
      System.out.println(s.size() + " " + s.isEmpty());
      System.out.print(s.add("value1"));
      System.out.print(s.add("value2"));
      System.out.print(s.add("value3"));
      System.out.print(s.add("value1")); // duplicate not allowed
      System.out.println();
      System.out.println(s);
      System.out.println(s.contains("value3") + " " + s.contains("value9"));
      System.out.println(s.remove("value2") + " " + s.remove("value2")); // value2 not exist in second remove
      System.out.println(s);
      System.out.println(s.size() + " " + s.isEmpty());
      for (String v : s) {
         System.out.print(v);
      }
   }
}