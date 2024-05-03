package Demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    Queue<Integer>integers = new PriorityQueue<>();
    integers.add(121111);//每一次都會發生
    integers.add(5);//add 未排序
    integers.add(-2);
    System.out.println(integers); // [-2,12,121111]
    System.out.println(integers.poll());//-2  poll = 拎最尾
    System.out.println(integers.poll());//5
    System.out.println(integers.poll());//12111

    
  }
}
