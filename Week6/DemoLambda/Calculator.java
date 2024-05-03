package Week6.DemoLambda;

public interface Calculator {

  int square(int x);

  public static void main(String[] args) {
    Calculator calculator = (x) ->{
      return (int) Math.pow(x,2);
    };
    System.out.println(calculator.square(3));//9
//另一個寫法

    Calculator calculator2 = (x) ->(int) Math.pow(x,2);

    System.out.println(calculator2.square(3));//9
    System.out.println(calculator2.square(4));//16

    Calculator calculator3 = x ->3;
    System.out.println(calculator3.square(56));//3
    System.out.println(calculator3.square(66));//3
  }
}
