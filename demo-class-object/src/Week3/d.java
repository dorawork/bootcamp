public class d {

  public static void main(String[] args) {
    System.out.println("Hello");
    Car c = new Car(); // c -> object reference =address
    c.setColor("RED");
    c.setSpeed(80.0d);
    c.setCapacity(432);
    System.out.println(c.getColor());//RED
    System.out.println(c.getSpeed()); //80.0
    System.out.println(c.getCapacity());
}
}
