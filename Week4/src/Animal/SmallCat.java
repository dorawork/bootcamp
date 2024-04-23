package Animal;
public class SmallCat extends Cat {

  private double weigth;

  public SmallCat(int age, String name, double weigth) {
    super(age, name); // Construct a cat object -> construct animal object
    this.weigth = weigth;
  }

  public double getWeight(){
    return this.weigth;
  }

  public static void main(String[] args) {
    SmallCat sc = new SmallCat(3,"Jenny",3.2); // null construct super() -> cat ()

    System.out.println(sc.getAge());//3
    System.out.println(sc.getAnimalName()); //name=Jenny
    System.out.println(sc.getCatName());//"null" //冇catname
    System.out.println(sc.getName());//Jenny
    System.out.println(sc.getWeight());//3.2
  }
}
