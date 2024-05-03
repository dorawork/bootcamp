package Week6.DemoStream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoFlatMap {
  public static void main(String[] args) {
    List<List<Integer>>IntegerLists = new LinkedList<>();
    IntegerLists.add(List.of(1,2,3));
    IntegerLists.add(List.of(10,-10,100,101));
    IntegerLists.add(List.of(101,203,-99));

    List<Integer>flattendList = IntegerLists.stream()//
    .flatMap(e -> e.stream())//
    .collect(Collectors.toList());

    System.out.println(flattendList);

    //List<List<Integer>> -> List<Customer>
    List<Customer> customers = IntegerLists.stream()//
    .map(e -> new Customer(e.size(), "Vincent"))

  }
  
}
