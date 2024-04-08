package questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 1/0+1/1+1/2+1/3+2/5+3/8+5/13+8
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int max = 8;
    int a = 0;
    int b = 1;
    int result = 0;
    for (int i = 0; i < max; i++) {
      System.out.print(b + " ");
      result = a + b;
      a = b ;
      b = result;
      //Step 1 = i = 0
      //Step 2 = print b = 1
      //Step 3 =   0 + 1, a = 1
      //Step 4 =  b = 1 = 1
      //Step 5 = result = 1
      //Step 6 = i = 1 (行第2次)
      //Step 7 =  print b = 1
      //Step 8 =  result = 1 + 1 = 2
      //Step 9 =  a = 1
      //Step 10 = b = 2
      //Step 11 = print b = 2
      //Step 12 = result = 1 + 2 = 3
      //Step 13 = a =2
      //Step 14 = b = 3
      //Step 15 2 + 3 =5
      //Step 16 = a = 3 , b = 5 
    }
       

      
      // System.out.println(result);
  
    //System.out.print(a);
  }
}