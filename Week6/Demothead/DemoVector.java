package Week6.Demothead;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoVector {


  public static void main(String[] args) {
    List<Character>characters = new ArrayList<>();//放舊同生ARRAY落去
    List<Character>characters2 = new Vector<>();

    Runnable concatLinkedList = () ->{
      for( int i = 0; i <1_000_000;i++){
        characters.add('s');
      }
    };
    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();

    //3 threads to 1 thread
    try{
      th1.join();
      th2.join();
    }catch (InterruptedException e){

    }

  
    System.out.println(characters.size());
  }
}
