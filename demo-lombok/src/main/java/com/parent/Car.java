package com.parent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
//@ToString Car(model=Tesla)
@ToString(callSuper = true)

public class Car extends BigCar{
  private String model;

//public Car(String model){
  //  super();
  //  this.model = model;
  //  }
  
  //Custom Constructor
  public Car (String model, int weight){
  super();
  this.model =model;
}


  public static void main(String[] args) {
    Car car = new Car("Tesla");
    car.setWeight(10);
    System.out.println(car.getWeight());
    System.out.println(car.toString()); //Car(super=com.parent.Car@372f7a8d, model=Tesla)


  }
}
