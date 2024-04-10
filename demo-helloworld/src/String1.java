

public class String1 {
  public static void main(String[] args) {

    // String message 入訊息
    String message1 = "hello";
    message1 += "1";// hello1
    System.out.println("This is Paul:" + message1);
    String s7 = "world";

    String s3 = "";
    String s4 = " ";

    // tool for String
    // length() 字款長度

    String y = "hello world!";

    int length0fY = y.length(); // =12
    System.out.println(y.length());

    //// charAt (int index) 計字數代表咩
    char character = y.charAt(2); // l
    System.out.println(y.charAt(0)); // h

    String str = "howareyou";
    char ch1 = str.charAt(0); //h
    char ch2 = str.charAt(1); //o
    char ch3 = str.charAt(2); //w
    System.out.println(ch1);
    System.out.println(ch2);
    System.out.println(ch3);

    //equals ()
    String S1 = "HELLO1";
    String S2 = "HELLO2";
    
    s7 += "!";
    System.out.println(s7); // 問佢 岩定唔岩
    int a = 5;
    int b = 10;
    boolean result1 = a > b;
    boolean result2 = a < b;
    boolean result3 = a * 2 == b;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    String s2 = "abcdefg";
    if (s2.charAt(0) == 'a' && s2.charAt(s2.length() - 1) == 'g') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    //indexOf
    //String
    String str2 = "Hello, World!";
    int index =  str2.indexOf('o');//print 4
    int index1 =  str2.indexOf('x');// print -1 (not found)
    int index2 = str.indexOf("Wordld"); //print 7 (數字)

    //compare to (String another string)
    String str3 = "apple";
    String str4 = "banana";

    int result = str3.compareTo(str4);//result = -1 negative
  }
}