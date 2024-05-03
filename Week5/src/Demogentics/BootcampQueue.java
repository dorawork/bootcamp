package Demogentics; //執好

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQueue<T> {// 可以放任何野 , T 及 OBJECT的分別

  private Queue<T> data;// Object can add anything 是class
  //<T> 沒有交代入口, 但是class can be one thing  
  //工具 compile-time 先知道

  private Object data2;

  public BootcampQueue() {
    this.data = new LinkedList<>();
  }

  // add
  public void add(Object data2) { // s -> Integer or String or Customer ...
    this.data2 = data2;
  }

  public void add2(T data) { // s -> Integer or String or Customer ...
    this.data2 = data;
  }

  // poll
  public T poll() {
    return this.data.poll();
  }


  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add2("hello");
    // bq.add2(3); // compile time type check

    bq.add(3);
    bq.add(3L);
    bq.add("llll");

  }
}
