package Week6.Demothead;

import java.util.LinkedList;

public class Demothead  {
  public static void main(String[] args)throws Exception {
    //3 thread
    //1. main thread
    //2. th1 
    //3. th2

    //Approach 1: A class to implemnt runnable interface (Thread constructor)
    Task task = new Task();

    //Approach 2: use lambda create runnable object (Thread constructor)
    Runnable task2 = ()->{// 使用lambda
      System.out.println("I 'am task 2 and run");
    };

    //3 Mythead extends Thread
    MyThread myThread = new MyThread();
    myThread.start();

    Thread th1 = new Thread(task);
    th1.start();// trigger run method()...

    Thread th2 = new Thread(task);
    th2.start();

    System.out.println("main ends...");

  }
}
