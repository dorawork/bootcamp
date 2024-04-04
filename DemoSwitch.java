public class DemoSwitch {
  public static void main(String[] args) {

    // Example 3
    char grade = 'D';
    // SCORE > 90 -> A(Pass)
    // 80-90 -> B (Pass)
    // 70 - 79 -> (Pass)
    // <70 -> F (Fail)

    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        System.out.println("Good");
        break;
      case 'B':
        System.out.println("This is grade B");
        System.out.println("OK ");
        break; // 分類完結
      case 'C':
        System.out.println("This is grade C");
        System.out.println("NOT OK");
        break;
    }
    // Grade A:5
    // B:4
    // C:3
    // D:2
    // E:1
    // F:0

    // switch (grade) {
    // case 'A' :
    // case 'B' :
    // case 'C' :
    // case 'D' :
    // case 'E' :
    // case 'F' :

    // switch (cannotcompare value)

    // String CHECK 字數
    String s5 = "hello"; // length 數字 比較
    if (s5.length() >= 5) {
      System.out.println("s1.length () =>5 ");
    }

  }
}
