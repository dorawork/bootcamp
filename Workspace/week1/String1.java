package Workspace.week1;

public class String1 {
  public static void main(String[] args) {
    
//String message 入訊息
String message1 = "hello";
message1 += "1";//hello1
System.out.println ("This is Paul:" + message1);
String s7 = "world";
s7 += "!";
  System.out.println(s7); //問佢 岩定唔岩
  int a = 5;
  int b = 10;
  boolean result1 = a > b;
  boolean result2 = a < b;
  boolean result3 = a *2 == b;
  System.out.println (result1);
  System.out.println (result2);
  System.out.println (result3);

  ////charAt(int index) 計字數代表咩
  String str = "howareyou";
  char ch1 = str.charAt(0); 
  char ch2 = str.charAt(1);
  char ch3 = str.charAt(2);
  System.out.println (ch1);
  System.out.println (ch2);
  System.out.println (ch3);
}
}