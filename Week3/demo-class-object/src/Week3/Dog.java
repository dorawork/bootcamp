public class Dog {

  private String firstName;

  private String lastName;

  private int age;

  // All arguments constructor (起個CONSTRUCTOR 需要指定內的參數)
  public Dog(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Dog(String firstName) {
    this.firstName = firstName;
    this.lastName = "Chan";
    this.age = 0;
  }

  // Empty Costructor
  public Dog() {
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String fullName() {
    // return this. first + " " + this.lastName;
    return this.firstName.concat(" ").concat(this.lastName);
  }

  public String toString() {
    return "Dog("
        + "firstName=" + this.firstName
        + ", lastName=" + this.lastName
        + ", age = " + this.age
        + ") ";
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);

    System.out.println(dog.toString());// "Dog (firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName());

    Square square = new Square();
    square.setLength(13);
    System.out.println(square.toString()); // "Squaur(lenght=13)
    // System.out.println(square.area());// 169

    Dog dog2 = null;
    // dog2.setAge(4)
    Dog dog3 = new Dog();
    dog3.setAge(15); // dog3 (address) -> find the dog object ->and then call its setAge()method

    Dog dog4 = new Dog("Ken", "wong", 13);
    System.out.println(dog4.toString()); // Dog(firstName=Ken, lastName=wong, age = 13)

    Dog dog5 = new Dog("Jenny");
    System.out.println(dog5.toString()); // Dog(firstName=Jenny, lastName=Chan, age = 0)
  }
}