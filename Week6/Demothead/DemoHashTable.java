package Week6.Demothead;

import java.util.HashMap;

public class DemoHashTable {
  
  //HashTable -> Thread-safe not ok
  //HashMap - >non THread-safe not ok
  HashMap<String, Integer> map = new HashMap<>();
  public static void main(String[] args) throws InterruptedException{
    DemoHashTable object = new DemoHashTable();
    object.map.put("dummy", 0);

    Runnable dummyEntry = () -> {
      for(int i = 0; i <2_000_000; i++){
        object.map.put(String.valueOf(i),i );
      }
    };

    Thread th1 = new Thread(dummyEntry);
    Thread th2 = new Thread(dummyEntry);
    th1.start();
    th2.start();
    th1.join();
    th2.join();
    System.out.println("dummy");
    
  }
}
