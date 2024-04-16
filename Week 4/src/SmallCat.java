public class SmallCat extends Cat {

  private double weigth;

  public SmallCat(int age, String name, double weigth) {
    super(age, name); // Construct a cat object -> construct animal object
    this.weigth = weigth;
  }

  public static void main(String[] args) {
    SmallCat sc = new SmallCat(); // null construct super() -> cat ()

    sc.getAge();
    sc.getAnimalName();
    sc.getName();

  }
}
