package Week6.DemoLambda;

public interface MathOperation {
  double Operate(double x , double y);//method

  static double calculator(int x , int y, MathOperation formula){ //#10-14
    return formula.Operate(x, y); //method
  } 

  public static void main(String[] args) {
    MathOperation addition = (a,b) -> a + b ; 
    MathOperation subtract = (a,b) -> a - b ; 
    MathOperation multiply = (a,b) -> a * b ; 
    MathOperation divide = (a,b) -> a / b ; 

    System.out.println(MathOperation.calculator(100, 5, addition)); //20.0
    System.out.println(MathOperation.calculator(100, 5, subtract));//105.0
    System.out.println(MathOperation.calculator(100, 5, multiply));//500.0
    System.out.println(MathOperation.calculator(100, 5, divide));//95.0
  }
}
