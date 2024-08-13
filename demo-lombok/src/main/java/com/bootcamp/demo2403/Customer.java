package com.bootcamp.demo2403; //要溫書! STATIC 轉 INESCED

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Customer {
  private String name;
  private List<Order> orders1; // c1.getOrders().size()

  public Customer(String name) {
    name = this.name;
    orders1 = new LinkedList<>();
  }

  public void add(Order order) { // add order 入list
    orders1.add(order);
  }

  public int orderCount() {
    return this.getOrders1().size();
  }

  public boolean isVIP() {
    return this.orderCount() >= 10;
  }

  // static method: input parameter -> produce -> output
  // instance method: Class attribute -> similar to static method parameter
  public static int orderCount(Customer customer) {
    return customer.orderCount();
  }

  public static void main(String[] args) {
    Customer c1 = new Customer("John");
    Order order1 = new Order("efe");
    c1.add(order1);
  
    System.out.println(c1);
  }

}