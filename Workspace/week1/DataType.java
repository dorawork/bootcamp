package Workspace.week1;

public class DataType {
  public static void main(String[] args) {
    // variable 變量
    // integer整數
    int x = 600;
    System.out.println(x);
    int y = 700;
    System.out.println(y);
    y = 500;
    x = 500;
    System.out.println("y " + y + " x  " + x);
    System.out.println(+y + x);

    // 試其他公式
    int apple = 5;
    int quantity = 10;
    int total = apple * quantity;
    System.out.println(total);

    int apple2 = 5;
    int quantity2 = 20;
    int total2 = apple2 * quantity2;

    int averageprice = (total + total2) / (apple + apple2);
    System.out.println(averageprice);

    double k = 1.3;
    double k2 = 1.32;
    double k3 = k + k2;
    System.out.println(k3);

    int u = 11 % 4;
    System.out.println(u);

    int peter = 1;
    int quantity3 = 3;
    int total3 = peter * quantity3;
    System.out.println(total3);
    //long l1 = i1 +100; //i1 +100-> int value -> long variable
    //compile time 不能down (f) Java ensure tpye security
    //float double 小數點, 由細轉大, 大轉細唔得
    //整數 int value 
    
    //double d5 = 10.4;
    //float d4 = 10.4F;

   // int JJ1 = 5;
   // byte i2 = 127;
   // short i3 = 30000;
    //char save the charator 要用' '開關引號
   // char cC1 = 'a';

    //boolean 只可以放true and false 不用開引號
    //int abe = 10 OK (variable 多變的 name) 
    
  }

}
