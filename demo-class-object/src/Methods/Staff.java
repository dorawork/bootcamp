package Methods;

public class Staff {

  private String name;

  private double salary;

//Constructor
  private Staff(String name){
    this.name = name;
  }

  //Static Method CLASS名
  public static Staff of(String name) {
    return new Staff(name);
  }
  //Instance Method  OBJECT名
  public double getSalary(){
    return this.salary;

  }
  public static Staff peter(){
    return new Staff("Peter");
  }

}
