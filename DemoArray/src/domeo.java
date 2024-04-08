
public class domeo  {

  public static void main(String[] args) {
    System.out.println("Hello, World!");

    String s = "hello";
    String s2 = "";
    String s3 = " ";

    boolean isEmptyResult = s2.isEmpty();
    System.out.println(isEmptyResult);

    System.out.println(s.isEmpty());
    System.out.println(isEmptyResult);

    System.out.println(s.isBlank()); // false
    System.out.println(s2.isBlank());// true
    System.out.println(s3.isBlank());// true (different)

    // substring()
    String result = s.substring(0, 3); // hel
    System.out.println(result);

    result = s.substring(2);
    System.out.println(result);// llo

    // lowercase()
    System.out.println("HElLO".toLowerCase()); // hello
    // toUpperCase()
    System.out.println("HEllo".toUpperCase()); // HELLO

    // contains
    System.out.println(s.contains("ll")); // true

    // startsWith()
    System.out.println(s.startsWith(("he")));// true
    // endsWith()
    System.out.println(s.endsWith("lo"));// true

    // replace()
    String after = s.replace("l", "z");
    System.out.println(after);// hezzo

    // trim()-> remove the space at the beginningand the tail of the string
    String s5 = "  hello  !world ";
    System.out.println(s5.trim());// "hello ! world" 刪頭尾
    System.out.println(s5.replace(" ", "")); // remove all spaces

    // index0f()
    char c = s.charAt(2);
    System.out.println(s.indexOf(c)); //2
    System.out.println(s.lastIndexOf(c)); //2  一組組

    System.out.println("hello".equals("Hello")); //false
    System.out.println("hello".equalsIgnoreCase("Hello"));// true
  }
}
