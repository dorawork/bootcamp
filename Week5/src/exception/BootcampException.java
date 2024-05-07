public class BootcampException extends Exception {
  // "extends Exception" implies "BootcampException" is a checked exception
  // because Exception.class is a checked exception

  public static void main(String[] args) { // throw JVM
    try {
      calculate(10, 2);
      System.out.println("End of Calculate() method");
    } catch (BootcampException e) {
      System.out.println("Exception in calculate() method, recovery step ...");
    } finally {
      System.out.println("finally ...");
    }

  }

  public static int divide(int x, int y) { //唔應該發生 要解決 ebanking例子 #21 解決方法throws BootcampExceptionthrow
    return x / y; // if y = 0, JVM will throw an object of ArithmeticException   #25解決方法  new BootcampException();
  }

  public static void calculate(int x, int y) throws BootcampException { // Solution 1
    try {
      divide(x, y);
      // .... throw  IAE
    } catch (ArithmeticException | IllegalArgumentException e) { //try去第2度
      throw new BootcampException(); 
      // because it is a checked exception, so we have to handle it before compilation
    }
  }

}