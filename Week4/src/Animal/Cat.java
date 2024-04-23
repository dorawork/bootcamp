package Animal;
public class Cat extends Animal {//類別

  public static String y = "DEF";

  private int age;

  private String name;

  public Cat() {
  }

  // Child Class Cat object inherit all instance variables, instance methods from Parent (Super) Class Animal object
  // but it does not inherit constructor

  public Cat(int age) {
    super(); // create Animal's constructor
    this.age = age;
  }

  public Cat(int age, String name) {
    // super(); // by default call super()
    super(name);
    this.age = age;
    System.out.println("I'm Cat Constructor ...");
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Approach 1\

  public void setCatName(String name) {
    this.name = name;
  }
  public String getCatName() {
    return this.name;
  }

  // Approach 2
  public String getAnimalName() {
    return "name=" + super.getName();
  }

  @Override //進化
  public void sleep() { // Method signature is same as the Animal object sleep()
    System.out.println("Cat is sleeping ...");
  }

  public String upperX() {
    return Animal.x.toUpperCase();
  }

public String toString() { //print 地址
    return "Cat(" //
        + "name=" + super.getName() //
        + ", age=" + this.age //
        + ")";
  }

  public static void main(String[] args) {
    Cat cat = new Cat(12);
    cat.setName("Jenny");
    System.out.println(cat.getName()); // "Jenny"

    // Cat has its own instance variable
    cat.setAge(10);
    System.out.println(cat.getAge());

    // Another child class extends Animal

    // New Animal

    // call sleep()
    cat.sleep(); // Cat is sleeping ...
    cat.run(); // Running ...

    Cat c2 = new Cat(2, "Jenny"); // super("Jenny")
    c2.setCatName("Vincent");
    System.out.println(c2.getCatName()); // Vincent
    System.out.println(c2.getName()); // Jenny

    System.out.println(c2.getAnimalName()); // name=Jenny //44行

    System.out.println(c2.upperX()); // ABC

    Animal a = new Cat(10, "Jenny"); //
    Cat c = (Cat) a; // downcast
    System.out.println(c.getCatName());// BULL
    
  }

}