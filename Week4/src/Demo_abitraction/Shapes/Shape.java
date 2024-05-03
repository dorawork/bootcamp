package Demo_abitraction.Shapes;

import java.math.BigDecimal;

public interface Shape {
  
  // 100% abstraction -> No any implementation in interface
  // Interface is a contract that the class should implement it

  // No instance variable in interface
  // You can only define "public static final" variable in interface
  // public static final String s = "hello";

  String s = "hello"; // 等於#12

  BigDecimal PI = BigDecimal.valueOf(Math.PI);

    //定義 Implicitly public

double area();

String print();

  // static method, with implementation class
  // public static double area(Square[] squares) {
  // }

  public static double area(Shape[] shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      sum = sum.add(BigDecimal.valueOf(shape.area()));
    }
    return sum.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.s);
    System.out.println(Shape.PI.doubleValue());

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle();
    shapes[1] = new Square();
    shapes[2] = new Circle();
    
  }
}

