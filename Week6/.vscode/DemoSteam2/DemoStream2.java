import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Week6.DemoStream.Customer;

public class DemoStream2 {
  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();
    System.out.println(empty.count());

    Stream<String> strings = Stream.of("Hello", "ABC"); // staticmethod -> constructor->new Stream object

    // filter, collect

    Stream<Integer> integers = Stream.iterate(1, n -> n + 2).limit(10); // ten number
    System.out.println(integers.collect(Collectors.toList()));

    strings = strings.filter(e -> e.length() > 3); // intermediate operation ->new Stream
    // .count(); //終結 terminal operation
    // System.out.println(strings.collect(Collectors.toList()));//[Hello]
    // //collector 已經terminal

    // steam - > forEach

    strings.forEach(e -> {
      System.out.println(e);// Hello
    });

    // sorted()
    List<Integer> integers2 = new ArrayList<>(List.of(400, 3, -1, 0, 100, -200));
    List<Integer> integers3 = integers2.stream()//
        .filter(e -> e.compareTo(0) >= 0) // 優先行
        .sorted()
        .collect(Collectors.toList());
    System.out.println(integers3);

    List<Customer> customers = 
    new LinkedList<>(List.of(new Customer(13, "Vincert"),
     new Customer(18, "Tommy"), new Customer(15, "Jerry"), new Customer(17, "Jerry")));

     Comparator<Customer> sortByAgeDesc = 
     (c1, c2) -> c1.getAge() > c2.getAge() ? -1 :1;
     // lambda
      //未抄
/*       List <Customer> sortByAgeDesc = customers.stream() //
      .sorted()//Comparator object -> descending order for age 排序
      .collect(Collectors.toList());
      System.out.println(sortByAgeDesc); */

      List<String> name = customers.stream()//
              .map(e->e.getName())//type change : Customer -> String
              .filter(e -> e.startsWith("J"))
              .sorted()
              .collect(Collectors.toList()); //toMap

              System.out.println(name);

              Stream<Integer> newStream = Stream.of(1,2,3).map(i ->{
                System.out.println(i);
                return i + 1;
              });//becasue map()is  interminate 冇終結到 //未寫改
              //1,2,3

  }
}
