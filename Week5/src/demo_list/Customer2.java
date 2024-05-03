import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import src.demo_list.Order;

public class Customer2 {

  private String name;

  private ArrayList<Order> orders;

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    // arraylist 定義 特點 可以去到最尾 lenght -1 (連續記錄點LOACTION)
    // 可以去到中間位置, HashMap 找不到 for 搜尋 key word
    // HashMap 搜尋, 用equal.
    // set底層HashMap 可以檢查重複 因為取代
    // HashSet->HashMap (最底層)
    ArrayList<Customer2> customers = new ArrayList<>();
    for (Customer2 c : customers) {
      if (c.getName().equals("Vincent")) {
      }
    }

    // Polymorphism
    // List (ArrayList)
    List<String> ss = new ArrayList<>();
    // ss object reference can only point to the methods that comply with List interface
    ss.add("hello");
    ss.remove(0);
    ss.add("abc");
    System.out.println(ss.get(0));

    // Set (HashSet)
    Set<String> ss2 = new HashSet<>();
    ss2.add("hello");
    ss2.remove("hello");
    System.out.println(ss2.size()); // 0

    // Map (HashMap)
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("John", "ABC");
    System.out.println(stringMap.get("John"));

    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size());// 指針: 1
  }

  public static void test(Collection<String> cs) {

    if (cs instanceof ArrayList<String>) {
      ArrayList<String> as = (ArrayList<String>) cs;
      System.out.println(as.get(0));
    } else if (cs instanceof HashSet<String>) {
      HashSet<String> hs = (HashSet<String>) cs;
      System.out.println(hs.add("hello"));// true
      System.out.println(hs.add("hello"));// false

    }
  }
}