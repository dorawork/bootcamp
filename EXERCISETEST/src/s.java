package EXERCISETEST.src;

import java.util.HashMap;
import java.util.Map;

public class s {


  public static void main(String[] args) {
    Map<Integer, String > map = new HashMap<>();
map.put(5, "apple" );
map.put(3, "orange");

for (Map.Entry<Integer, String > entry : map.entrySet()) {
  Integer key = entry.getKey();
  String value = entry.getValue();
  
  System.out.println("Key: " + key + ", Value: " + value);
}
  }
}