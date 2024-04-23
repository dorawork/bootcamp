package Demo_abitraction.Sport;

public interface Action {
  void run();
  void walk(); //冇實體

  //Jave 8 
  default void swim(){ //intsance method by inheritance
    System.out.println("Default method: swim...");
  }
  static void sleep(){
    System.out.println("static method : sleep...");

  }

    //Static method call class
   public static void main(String[] args) {
    Action.sleep();//用CLASS名 -> static method : sleep...
    Person p = new Person();
    p.swim();//implements Action { SWIM
    //p.sleep();//not OK
   }
  }
