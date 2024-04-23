package literalpool;

public class DemoString {

  public static void main(String[] args) {
    String s ="hello";
    String s2 ="hello";

    System.out.println(System.identityHashCode(s));//617901222, hashcode -> object address
    System.out.println(System.identityHashCode(s2));//617901222

    String s3 ="hello ";
    System.out.println(System.identityHashCode(s3));//1159190947

    String s4 =new String("hello");//新Object
    System.out.println(System.identityHashCode(s4));//925858445

    String s5 =String.valueOf("hello"); //搵番同一隻Object
    System.out.println(System.identityHashCode(s5));//617901222

    System.out.println(s == s2); //true
    System.out.println(s == s5); //true
    System.out.println(s == s4); //false

    String str = "aaa"
    System.out.println(System.identityHashCode(str));
    str = str + "bbb"; //Check values
    System.out.println(System.identityHashCode(str));

  }
  
}
