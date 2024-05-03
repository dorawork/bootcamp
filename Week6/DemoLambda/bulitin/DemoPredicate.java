package Week6.DemoLambda.bulitin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    int age = 18;
    boolean isElderly = age > 65;

    BiPredicate<String, Integer> isCharacterS =
    (str, idx) -> str.charAt(idx) == 'S';

BiPredicate<String, String> startsWith = (s1, s2) -> s1.startsWith(s2);
System.out.println(startsWith.test("hello", "he")); // true test名

BiPredicate<String, String> endsWith = (s1, s2) -> s1.endsWith(s2);
System.out.println(endsWith.test("hello", "lo")); // true

BiPredicate<String, String> combined = startsWith.and(endsWith);
System.out.println(combined.test("hello", "lo")); // false
System.out.println(combined.test("lollo", "lo")); // true

BiPredicate<String, String> combined2 = startsWith.or(endsWith);
System.out.println(combined2.test("hello", "lo")); // true
System.out.println(combined2.test("lollo", "lo")); // true

BiPredicate<String, Integer> lengthLargerThan =
    (s1, length) -> s1.length() > length;
System.out.println(lengthLargerThan.test("hello", 5)); // true
}

public static boolean isCharacterS(String s, Integer idx) {
return s.charAt(idx) == 'S';
}
}