import java.util.Arrays;

public class DemoArray2 {

  public static void main(String[] args) {
    long l = 22000000L;
    // int x2 =l; // complie time error X
    int x2 = (int) l; // You pick the risk.
    System.out.println("x2=" + x2); // -2094967296

    short s2 = 128;
    byte b = (byte) s2;
    System.out.println("b=" + b); // -128 (risk: overflow)

    // The way to declare and assign String value
    String s3 = "abc"; // "abc" is the string object in heap
    String s4 = new String("abc"); // this "abc" is another new string object in heap (新的)
    String s5 = "abc"; // this "abc" is same as the one in s3.
    String s6 = new String("abc"); // this "abc" is another new string object
    //
    String[] strings2 = new String[3];
    strings2[0] = "hello";
    strings2[1] = "hello";
    strings2[2] = "hello";

    String[] strings3 = new String[] { "hello", "hello", "hello" }; // imply the length =3
    String[] strings4 = { "hello", "hello", "hello" }; // imply you have to assihn an string array object

    for (int i = 0; i < strings2.length; i++) { // 0,1,2
      System.out.println(strings2[i]);
    }

    // TEST 9 TPYE
    boolean[] TEST = new boolean[3];
    System.out.println(TEST);

    // Sorting - Insertion sort
    int[] arr5 = new int[] { -5, 10 };// 0,1,2,3,4,5
    for (int i = 1; i < arr5.length; i++) {
      int key = arr5[i];
      int j;

      for (j = i - 1; j >= 0; j--) {
        if (arr5[j] <= key) {
          break;
        }
        // if -> swap -> break
      }
      arr5[j + 1] = key; // inset

    }
    System.out.println(Arrays.toString(arr5));

    // Sorting -Selection Sort

  }
}