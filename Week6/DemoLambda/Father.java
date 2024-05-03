package Week6.DemoLambda;
public class Father implements Swim {
  
  @Override
  public void swim(){
    System.out.println("I'm swimming");
    System.out.println("Bye Bye");
  }
  public static void main(String[] args) {
    //Before Lambda
    Father father= new Father();
    father.swim();

    //After Lambda (after Java 8)
    Swim father2 = () -> {
      System.out.println("I'm swimming");
      System.out.println("Bye Bye");
    }
    father2.swim();
  }
}
