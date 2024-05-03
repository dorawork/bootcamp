package EXERCISETEST.src;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class predicate {
  
  public static void main(String[] args) {
    int age = 30;
    boolean isChild = age > 18;

    BiPredicate<String,Integer> isTest = 
    (str, idx) -> str.charAt(idx) == 'e';

    BiPredicate<String, String>startwith = (s1, s2) ->s1.startsWith(s2);
    System.out.println(startwith.test("hhhhhhhhere", "hh"));

  }
  public static boolean isTe(String s,  Integer idx){
    return s.charAt(idx) == 'S';
  }
}
