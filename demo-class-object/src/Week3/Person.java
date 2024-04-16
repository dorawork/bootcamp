public class Person {

  private int age; //<---Getter 及 SETT PRIVATE
//private boolean is Elderly; 不用這樣寫 27行, 唔洗SET
//決定 長者的條件 65歲
// 或 決定 VIP 條件  落過幾多單 落單日期, get計數, 即boolean 
  // private double salary;

  // getter and setter for age

  public Person(){ ///constructors
  
  }

  public Person(int age){ //constructors
    this.age= age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(65);
    System.out.println(person.isElderly()); // true

    Person person2 = new Person();
    person2.setAge(64);
    System.out.println(person2.isElderly()); // false

    //if (person2.getAge() >= 65&& person.getXXX < 20) { //不建議

    if (person2.isElderly()) {

    }

    Person p3 = new Person(3);
    boolean result = p3.isElderly();

    boolean isEldealy= new Person(65).isElderly();

  }


}