package Week6.DemoLambda.bulitin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFuction {

  public static void main(String[] args) {
    // y = f(x)
    // y = x + 1
    Function<String, Integer> function = s -> s.length(); // <左入, 右出>>
    System.out.println(function.apply("Hello"));// 5

    BiFunction<String, String, Integer> totelLength = (s1, s2) -> s1.length() + s2.length(); // 兩入, 一出
    System.out.println(totelLength.apply("hello", "abc"));// 8

    // why
    Map<String, Integer> nameLengthMap = new HashMap<>();//
    nameLengthMap.put("John", 4);
    Function<String, Integer> nameLength = s -> s.length();// <左入, 右出> */
    nameLengthMap.computeIfAbsent("Vincent", nameLength);

    nameLengthMap.computeIfAbsent("Oscar", s -> s.length()); // method 可以加條公式

    System.out.println(nameLengthMap);

    // merge()
    nameLengthMap.merge("Vincent", 9, (o, n) -> o * n); // ,9 新數,(o=7舊數 * 鄐數 n=9) , 搵到Vincent再用新公式 7*9
  }

}
