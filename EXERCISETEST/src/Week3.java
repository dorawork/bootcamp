package EXERCISETEST.src;

public class Week3 {

  public static void main(String[] args) {
    String str1 = "hello1";
    String str2 = "hello2";
    String str3 = "hello world";
    
    System.out.println(str1.equals(str2));//true value一樣
    System.out.println(str1==str2);//不會用==
    str2 = str1 + "world";
    System.out.println(str2);

  }
  
  
}
