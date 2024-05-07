package Week6.Demothead;

public class Calculator {

  public static int x = 16; // x 可以用 Vector 裝

  public static synchronized void addOne() { // synchronized 功能鎖門,
    x++;
  }

  //  public static void addOne() { // 如果冇加鎖就不穩定

  public static void main(String[] args) {
    Runnable incrementOne = () -> { //只係比#20-21用

      for (int i = 0; i < 1_000_000; i++)// 線性不安全, veribale 安全 要留意 Thread
        addOne();//每行一次addone,x++ 
      ;
    };
    Thread th1 = new Thread(incrementOne);
    Thread th2 = new Thread(incrementOne);
    th1.start();// test!
    th2.start();

    try { // 有JOIN先行完其他先行除
      // MAIN之外
      th1.join();
      th2.join();
    } catch (InterruptedException e) {
    }

    System.out.println(Calculator.x);// MAIN thread
  }
  }