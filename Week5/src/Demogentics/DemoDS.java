package Week5.src.Demogentics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DemoDS {

  public static void main(String[] args) {
    Map<String, StringBuilder> map = new HashMap<>();
    StringBuilder sp = new StringBuilder("hello");
    StringBuilder sp2 = new StringBuilder("World");
    map.put("a", sp);
    map.put("b", sp2);

    Queue<StringBuilder> qs = new LinkedList<>();
    qs.add(sp);
    qs.add(sp2);

    System.out.println(map.size());//2
    System.out.println("qs=" + qs);// [StringPrinter(data=hello), StringPrinter(data=xxx)]
  }
}
