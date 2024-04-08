public class test {
  public static void main(String[] args) {
    car car = new car(); // still work, because the class"car" is public
    car.setSpeed(100.0d);
    System.out.println(car.getColor());// null

    // int[] integers = null;
    // integers[0]=1 ; //null pointer exception
    // int x = null;
    Integer x2 = null;
    String s2 ="hello"; // char[] -> 'h' 'e' 'l' 'l' 'o'
    

  }
}
