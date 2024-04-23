package abstracts; //終結者

public class SuperCat extends SuperAnimal{

  private int age;

  public SuperCat (String name, int age){
    super(name);
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public void sleep() {
    System.out.println("Anmial is sleeping");
  }

  public void run() {
    System.out.println("Anmial is running");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }

  @Override
  public void sit() {
    System.out.println("Cat is sitting on the floor");
  }


  public static void main(String[] args) {
    SuperCat sc = new SuperCat("jew", 016);

    
  }
  
}
