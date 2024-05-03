package Week5.src.Demogentics;

public class Claculator<T extends Number>{

  private T x;

  private T y;
//intrices method
  public double sum3 (T x, T y){
    return x.doubleValue() + y.doubleValue();
  }

  public static int sum(int x, int y) { //擁有者 #50
    return x + y;
  }
  //status method
  public static double sum(double x, double y) { //未完成
    return x + y; // BigDecimal
  }
  //<T extends Number>暗示描述條事根據佢放的tpye, 一樣範圍 implies x & y are object that 
  //belong to the class of Byte, Short, Ineteger, Long, Double, Float
  //So you cannot pass a String Object into the parameters x and y

  public static <T extends Number & Swim> double sum(T x, T y) {// primitive/ Wrapper ClasS?
    // Byte, Short, Ineteger, Long, Double, Float
    return x.doubleValue() + y.doubleValue(); // BigDecimal 冇紅線
    //接收者 發送者 RUNTIME先知, 
  }

  public static double sum2(Number x, Number y) {
    return x.doubleValue() + y.doubleValue(); 
  }

  public static void main(String[] args) {
    System.out.println(sum(2,3));//5
    System.out.println(sum(2,3L));//5.0
    System.out.println(sum(2,3.3d));//5.3
    System.out.println(sum(2.3f,3.2d));////

    //Complie time -> Tpye -Saffty
    // limit the type range of  x & y, so that x & y must be ableto call doubleValue()
    // 因為已經有CODE寫確定左 double Value

    //Run-time -> Polymorphism
    //sum(2.3f, 3.2d)
    //x.doubleValue()->find the Float Object in heap, we can calling the Float.doubleValue()

    System.out.println(sum2(3.4d,3.4d));

        //
        Calculator<Long> calculator = new Calculator<>();
        System.out.println(calculator.sum3(Long.valueOf(10), Long.valueOf(20))); // object -> call static method
    
        Calculator.sum(3.2d, 3.4d); // static method
    
        Calculator.sum(new SuperLong(), new SuperLong());
      }

  }
}
