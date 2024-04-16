package staticblock;

public class Student {

  
  public static final String collegeName;

  //instance vaible
  private String name;

  //static block
  static{
    System.out.println("static block");
    abc = "world";
  }

  // instance block
  {
    System.out.println("instance block");
    this.name = "John";
  }

  public Student(String name){
    System.out.println("Construcor");
    if (name != null){
      this.name = name;
    }
  }

  //main
public static void main(String[] args) {
  System.out.println("main start");
    Student s =new Student("Jenny");
    Student s2= new Student("Sally");
    System.out.println("abc=" + abc); //world
    System.out.println("main end");

  }
}
