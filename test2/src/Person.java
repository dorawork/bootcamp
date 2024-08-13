import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private List<adress> address;

  public Person(String name){
    this.name = name;
    this.address = new ArrayList<>();
  }
  public static void main(String[] args) {
    adress adress1 = new adress(null, null);
    adress1.add("asf", "sd");
System.out.println(adress1);
  }
  
}
