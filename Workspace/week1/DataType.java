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
  }
}
