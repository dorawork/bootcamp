package exception;

public class exception { //未明***要明
  public static void main(String[] args) {
    // checked exception (compile time exception)
    // unchecked exception (run-time exception)
    // if salary array contain negative value, you treat total as 0.
    int total = 0;
    try {
      total = totalSalary(new int[] {100, -10, 45}); // java.lang.IllegalArgumentException //傳遞參數是負數
    } catch (IllegalArgumentException e) {//萬一發生
      total = 0;//可以做不同事
    }
    System.out.println("total=" + total);

    int x = 0;
    int r = x == 0 ? 0 : 8 / x;

    int r2 = 0;
    try {
      r2 = 8 / x; // java.lang.ArithmeticException: / by zero , 大問題: 0 
    } catch (ArithmeticException e) {//數字運算上 數學運算 除 0 問題
      // send sms
      // send email to you boss
    }

    try {
      getString(new char[] {'c', 'a', 't'}, -2, 2); // java.lang.ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
      // ...
    }
    
  }
  // ArrayIndexOutOfBoundsException
  public static String getString(char[] characters, int beginIdx, int endIdx) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIdx; i <= endIdx; i++) {
      sb.append(characters[i]);
    }
    return sb.toString();
  }

  public static int totalSalary(int[] arr) {
    int sum = 0;
    for (int x : arr) {
      if (x < 0)
        throw new IllegalArgumentException(); // an error event
      sum += x;
    }
    return sum;
  }
}