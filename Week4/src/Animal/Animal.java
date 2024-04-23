package Animal;
public class Animal {

  public static String x = "abc";

  private String name;

  public Animal() {
    System.out.println("I'm Animal Constructor ...");
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("Sleeping ...");
  }

  public void run() {
    System.out.println("Running ...");
  }

  private void hello() {
    System.out.println("hello");
  }

  public String lowerY() {
    return Cat.y.toLowerCase();
  }

  public static void main(String[] args) {
    Cat c1 = new Cat(12,"SBD"); // I'm Animal Constructor ... //因為Animal class 所以 print 
    Cat c2 = new Cat(99, "Vincent"); 
    Cat c3 = new Cat(12, "d");
    //c2.setAnimalName("VVVV");
    System.out.println(c2.getName()); // Vincent
    System.out.println(c2.getAnimalName());// name=Vincent
    System.out.println(c2.getAge());// 99
    System.out.println(c2.toString());//null name 原因?

    Animal animal = new Animal();  //因為Animal class print 多次, 行Animal class
    System.out.println(animal.lowerY()); // def
  }

}