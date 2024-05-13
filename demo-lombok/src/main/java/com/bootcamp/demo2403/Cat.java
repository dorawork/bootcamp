package com.bootcamp.demo2403;

public class Cat {
  private String name;
  private int age;

  public Cat(String name, int age){
    this.age=age;
    this.name=name;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

}
