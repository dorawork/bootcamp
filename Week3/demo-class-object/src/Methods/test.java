package Methods;

public class test {
  
  public static void main(String[] args) {
    // / Staff s1 = new Staff("John"); // private constructor

    // Static Method //
    Staff s2 = Staff.of("John");
    Staff s3 = Staff.peter();

    //Instance Method //RUNTIME先用
    double salary = s3.getSalary();
 //every Staff object has its own salary
  }
  public int sum(int x , int y)
}