package homework;

public class animal {

  private String name;
  private int age;
  private int weigth;
  
  public void sound(){
    System.out.println("animal makes a sound");
  }

  public animal(String name, int age, int weigth){
    this.name=name;
    this.age=age;
    this.weigth=weigth;
  }

  public String getName(){
    return this.name;
  }
  public int getWeigth(){
    return this.weigth;
  }
  public int getAge(){
    return this.age;
  }
}
