package collectionlearning;

import static java.util.Map.Entry;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
   public static void main(String[] args) {
      LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
      System.out.println(m.size() + " " + m.isEmpty());
      System.out.print(m.put("key1", "value1"));
      System.out.print(m.put("key2", "value2"));
      System.out.print(m.put("key3", "value3"));
      System.out.print(m.put("key3", "value1"));
      System.out.println();
      System.out.println(m);
      System.out.println(m.containsKey("key2") + " " + m.containsValue("key2"));
      System.out.println(m.containsKey("value1") + " " + m.containsValue("value1"));
      System.out.println(m.get("key2") + " " + m.get("key9"));
      System.out.println(m.remove("key1") + " " + m.remove("key1"));
      System.out.println(m);
      System.out.println(m.size() + " " + m.isEmpty());
      for (String k : m.keySet()) {
         System.out.print(k);
      }
      System.out.println();
      for (String v : m.values()) {
         System.out.print(v);
      }
      System.out.println();
      for (Entry<String, String> e : m.entrySet()) {
         System.out.print("[" + e.getKey() + " " + e.getValue() + "]");
      }
   }
}
