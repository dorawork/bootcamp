package demo_list.demo_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* import Customer.Order; */

public class DemoHashMap {

  public static void main(String[] args) {
    // John 13
    // Vincent 18 一對對
    // 左邊 redpoclass
    HashMap<String, Integer> mapper = new HashMap<>(); // left hand side :key
    // right hand side =value
    // 有record 放入去
    mapper.put("John", Integer.valueOf(13));// put an "entry" into map #27(forloop)
    mapper.put("Vincent", 18); // autobox,valueof int -> integer
    // no ordering
    // Get value by key (cannot get key by value) 左邊找右邊
    System.out.println(mapper.get("John"));// 13
    System.out.println(mapper.get("Vincent")); // 18

    // for-each
    // 一條record = 一條Entry #18 #19
    // : mapper 在一堆資料上拿
    // 左邊 = 定義 for each 及 HashMAP 寫法一樣
    // seter = put 直接可以get #18
    // class 裡 有class
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      System.out.println(m.getKey() + "" + m.getValue());
    }

    for (Map.Entry<String, Integer> k : mapper.entrySet()) {
      System.out.println(k.getKey() + "" + k.getValue());
    }
    // 冇SETER改資料
    // key 不能重複 cannot be deuplciated in a HashMap
    // put -> update
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent")); // 20

    mapper.put("Jenny", 24);

    // sump up all integers in the map 計總數

    int sum = 0;
    for (Map.Entry<String, Integer> map : mapper.entrySet()) {
      sum += map.getValue();
    }
    System.out.println("sum=" + sum);//57

    int sum1 = 0;
    for (Map.Entry<String, Integer> abc : mapper.entrySet()) {
      sum1 += abc.getValue();
    }
    System.out.println("sum1=" + sum1);//57

    //為甚麼他會知道Vincent是同一個??因為 HashCode 是一樣
    //Vincent HashCode來自 String  的 Method override
    //否則HashCode是Address
    //put是for loop 在check Vincent存不存在, 不存在insert, 存在override
    //有if 是否一樣HashCode
    /*
     * HashMap<Customer, Integer>agaMap =new HashMap<>();
     * ageMap.put(new Customer("John"), 13);
     * ageMap.put(new Customer("John"), 17);
     * System.out.println(ageMap.get(new Customer("John")))//null;
     * 
     * System.out.println(agaMap.size());// 2
     */

    // key ->entrySet 全部野

    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();

    ArrayList<Order> orders = new ArrayList<>(); //將order放在arraylist內,有兩張orders
    orders.add(new Order(100));
    orders.add(new Order(250));

    orderMap.put(new Customer("John"), orders);//Customer put

    ArrayList<Order> orders2 = new ArrayList<>();
    orders2.add(new Order(1200));
    orders2.add(new Order(20));
    orders2.add(new Order(88));

    orderMap.put(new Customer("Vincent"), orders2);

    // John -> order 1: 100, order 2: 250
    // Vincent -> order: 1200, order 2: 20, order 3: 88

    // totalOrderAmount=1658
    // entrySet()
    sum = 0;
    for (Map.Entry<Customer, ArrayList<Order>> entry : orderMap.entrySet()) { // entrySet() -> entry -> key and value
      for (Order o : entry.getValue()) {//唔明
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);

    // values()
    sum = 0;
    for (ArrayList<Order> orderList : orderMap.values()) {//拎value ?所以arraylist? 不拿customer?
      for (Order o : orderList) {
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);

    // keySet()
    for (Customer customer : orderMap.keySet()) {
      System.out.println("customer=" + customer.getName());
    }

    // containsKey(), containsValue()
    System.out.println(orderMap.containsKey(new Customer("Vincent"))); // false, why?

    // Conclusion:
    // 1. If they are Different Objects -> we can treat them as same thing
    // (equals(), hashCode())
    // 2. if they are Same Object, -> all the values inside the object are same

    orderMap.put(new Customer("Sally"), orders); // same array objects with John

    // orders -> add an order

    // print out John and Sally orders

    orderMap.remove(new Customer("Vincent"));
    System.out.println(orderMap);
  }
}