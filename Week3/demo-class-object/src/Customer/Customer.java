package Customer; // subfolder

import java.util.Arrays;

public class Customer { //Attributes

  private String username; 

  // One Customer has many orders

  private Order[] orders; //array 有好多不同訂單  / 只有一款訂單 想形容 

  public Customer(String username, Order[] orders) { //construtors
    this.username = username;
    this.orders = new Order[0]; // 長度
  }

  public Customer(String username) {
    this.username = username;
  }
  public void setUsername(String username){ 
    this.username=username;
  }

  public void add(Order order) { //ADD未識新野  
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.orders[idx++] = copyArr[i];
    }
    this.orders[idx] = order;
  }

  public String toString() { //print 地址
    return "Customer(" //
        + "username=" + this.username //
        + ", orders=" + Arrays.toString(this.orders) //ARRAYS
        + ")";
  }
  public static void main(String[] args) {
    Customer customer = new Customer("John"); //create a new object

    customer.setUsername("Peter");
  }
}