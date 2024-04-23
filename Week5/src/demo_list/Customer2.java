import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

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

    // Polymorphism (多型態)
    // 未抄得切

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