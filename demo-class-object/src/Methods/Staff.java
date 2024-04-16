package Methods;

public class Staff {

  //Static Final Varible (Class Constant, belongs to class)
  public static final double PI =3.14159;

  //Final Variable (Constant, belongs to object)
  private final int HOURS_OF_DAY=24;

  //Instance Varible 形容Object
  private String name;
  private double salary;
  private int age;

  //Static Varible 形容 公眾用 
  public static int age_limit; // 0

//Constructor 第二位置
  private Staff(String name){ // 23行可以開番, 一定要有NU會冇左, 
    this.name = name;
  }

  //Static Method CLASS名, 放最底 (可以去第2個位) 公家用, CLASS工具 不會有THIS 多static
  public static Staff of (String name) {
    return new Staff(name);
  }

  public static Staff peter(){
    return new Staff("Peter");
  }
    public static int getAgeLimited(){
      return age_limit;
    }
  

  //Instance Method  每一個OBJECT名都要, 例如: 身份証 每一次都要比GET
  public double getSalary(){
    return this.salary;
  }


    public static void main(String[]args){
      Staff.age_limit=10; // write
      System.out.println(Staff.age_limit); //10 (read)
      Staff.age_limit =12; //write



      //Final Instance Varible
      System.out.println(s1.getHourOfDay());
      Staff s2  = Staff
    }
  }




