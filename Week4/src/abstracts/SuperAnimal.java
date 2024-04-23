package abstracts;

public abstract class SuperAnimal {// cannot create object for speranimal

  private String name;

  public SuperAnimal() {
    //super()
  }

  public SuperAnimal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void eat(); //method signtrue

  public void sleep() {
    System.out.println("Anmial is sleeping");
  }

  public void run() {
    System.out.println("Anmial is running");
  }

  public static void main(String[] args) {
    // SuperAnimal sa = new SuperAnimal() {

  };
}
