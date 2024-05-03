package EXERCISETEST.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Week6Lambda {

  public static void main(String[] args) {
    List<Integer> integers = new LinkedList<>();
    integers.add(120);
    integers.add(111);

    List<Integer> odds = new ArrayList<>();
    for (Integer i : integers){
      if(i % 2 == 1)
      odds.add(i);
    }
    System.out.println(odds);
  

  //STEAM
  List<Integer> result = integers.stream()
  .filter(e - )
  .filter(e -> e % 2 ==1)
  .filter(e -> e > 100)
  .collect(Collectors.toList());
  System.out.println(result);
  
}
}