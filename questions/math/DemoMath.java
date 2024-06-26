package questions.math;

public class DemoMath {
  
  public static void main(String[] args) {
    //Math.pow()
    int base = 2;
    double result = Math.pow(2.0d, 3);//upcast 1 -> double 次方
    System.out.println(result);// 8

    int a = 10; //比較
    int b = 9;
    int min = Math.min(a,b);

    if (a > b){
      min = b;
    }else{
      min =a;
    }

    int max = Math.min(a,b);

    if (a > b){
      max = a;
    }else{
      max = b;
    }

    double data = -3.2;
    double r = Math.abs(data);
    if (data <0){
      r *= -1;

    }
    System.out.println(Math.round(3.45));//3
    System.out.println(Math.round(3.50));//4

    
    System.out.println(Math.sqrt(9));//3
    System.out.println(Math.sqrt(9.1));//3.0166206257
    System.out.println(Math.sqrt(-9.0));//double -> NaN

    System.out.println("ceil="+ Math.ceil(3.1));//4
    System.out.println("floor="+ Math.floor(3.1));//3

int [] arr = new int []{10, 4, 20, 3}; //找最大數字
int maxx =Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i ++){
  maxx = Math.max(arr[i], maxx);
}
System.out.println("max=" + maxx);
    }
    }
