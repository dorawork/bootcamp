package Demogentics;

public class BCList<T,U> { //假設String / Integer
  private T data1; //可以放不同的type
  private U data2;

  public BCList(T data1, U data2){
    this.data1=data1;
    this.data2=data2;
  }

public T getData1() {
    return this.data1;
  }

  public U getData2(){
    return this.data2;
  }//object complime time

  public static<T extends Number> double sum(T number1, T number2){ // T 獨立STATIC不關系 no relationship to line 1 <T>
    //<T extends Number> 但要形容
    System.out.println(number1.getClass());
    System.out.println(number2.getClass());
    return number1.doubleValue() + number2.doubleValue();
  }

public static void main(String[] args) {
  BCList<String, Integer> bcList = new BCList<>("ABF", 12);
  System.out.println(bcList.getData1());
  System.out.println(bcList.getData2());

//T and T can different
/* BCList<String, Integer> bcList = new BCList<>("AFEFE", 12);
System.out.println(bcList.getData1());
System.out.println(bcList.getData2()); */

// T & U CAN BE SAME TYPE?
//public class BCList <T,T> -> two attributes same type
BCList<String, String> bcList2 = new BCList<>("AFEFE", "dwdgrgr");// bc兩個 可以唔一樣?
System.out.println(bcList2.getData1());
System.out.println(bcList2.getData2());


sum(Integer.valueOf(13), Long.valueOf(20));//#20 public static

}

    // int -> Integer (autobox)
    // integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast -> overflow)

    // Wrapper Class cannot be coverted between each others
    // Integer -> Long (No auto or direct relationship)
    // Long -> Integer (No auto or direct relationship)

  }

