package EXERCISETEST.src;

public class Intger {


  public static void main(String[] args) {
    
  
  Integer i1 = 127;
  Integer i2 = 127;
  System.out.println(i1 == i2);

  String words = "helloword";
  StringBuilder sb = new StringBuilder();
  sb.append("Name=").append(words);
  String words1 = sb.toString();
  System.out.println(words1);//Name=helloword
}
}
