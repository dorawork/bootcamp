public class test {
  public static void main(String[] args) {
    Car car33 = new Car(); // still work, because the class"car" is public
    car33.setSpeed(10.0d);
    Car c3 = new Car ();
    c3.setCapacity(10);
    System.out.println(car33.getColor());// null 因為這一個沒有SET CAR 空指針
    System.out.println(car33.getSpeed());//10.0d
    System.out.println(car33.isOverSpeed());
    System.out.println(c3.getCapacity()); // 10 第5行

    if (car33.isOverSpeed()){ // == trun 冇了90的數字

    }

    // int[] integers = null;
    // integers[0]=1 ; //null pointer exception
    // int x = null;
    Integer x2 = null;
    String s2 ="hello"; // char[] -> 'h' 'e' 'l' 'l' 'o'

    boolean b1 = true;
    System.out.println(b1);

  }
}
