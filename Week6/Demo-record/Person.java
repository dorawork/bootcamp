
public record Person(String name, int age) {

  public static void main(String[] args) {
    //no empty constructor - all args
    Person p1 = new Person("Vincent", 13);
    Person p2 = new Person("Vinceent", 13);
    
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode() == p2.hashCode());

    System.out.println(p1.toString());

    //getter
    System.out.println(p1.name());//getter, skip "get"
    System.out.println(p1.age);

    //no setter
  }
  
}
