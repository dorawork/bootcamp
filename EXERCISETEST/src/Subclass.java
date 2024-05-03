package EXERCISETEST.src;

import java.util.ArrayList;
import java.util.HashMap;

public class Subclass extends Week4Polymorphism {

  @Override
  public void doSomething() {
    System.out.println("媽");
  }

  public static void main(String[] args) {
    Week4Polymorphism o1 = new Week4Polymorphism();
    Week4Polymorphism o2 = new Subclass();

    o1.doSomething();
    o2.doSomething();

    System.out.println(o1);

    System.out.println(o2);

    HashMap<Integer, ArrayList<Week3>>orderMap1 = new HashMap<>();
    ArrayList<Week3>order= new ArrayList<>();
    order.add(new Week3(30));
    orderMap1.put(12, order);

    System.out.println("new order =" + order + "orderMap1" + orderMap1);//地址原因?

  }
}