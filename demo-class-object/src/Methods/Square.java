package Methods;

public class Square {
  // pass by value -> primitives, wrapper classes object, string object
  // pass by refernece -> all types of array object, custom class oject

  private int length;
  
  public Square(int length){
    this.length = length;
  }
  
  public int getLength(){
    return this.length;
  }
  public void setLength(int length){
    this.length = length;
  }

  public int area(){
    return this.length * this.length;
  }

  public static String concat(String x, String y) {
    return x +y;
  }
  public static void addOne (short[] arr) {
    for (int i = 0 ; i < arr.length; i++){
      arr[1] = (short)(arr[i]+1); // short +int -> int
  }
}

//有人比左資源我地, 唔洗THIS
  public static void resize(Square square, int newSize){
    square.setLength(newLength);
  }




  //Square
  Square q1= new Square (10);
  resize(sq1, 20); //passinng copy 改變內容
  System.out.println((sq1.area()));//400

public static int sum(int x, int y) {
  return x + y;
}

public static void main(String[] args){
  //pass by value -> primitives, wrapper classes object, String object
  //pass by reference -> all types of array object, custom class object
}

int a = 4;
int b = 7;

int r1 = sum (a, b);//pASSING COPY OF VALUES OF A AND B

Integer q = 10;
Integer e  = 11;
int r2 = sum(q, e);//passing copy of values of q and  e
//after concat(),q =10, e = 11, r2 =21

String s1 = "hello";
String s2 = "world";
String r3 = concat(s1,s2);//passing cpoy of vlaues of s1 and s2
//after concat (),s1 ="hello", s2 = "world"

short[] arr1 =new short[] {3,4,9};
addOne(arr1);
System.out.println(Arrays.toString(arr1));
//after add(), [4,5,10] arr1 is still pointing


Square sq1 = new Square(10);
resize(sq1, 20);
System.out.println(sq1.area());

Squares sq2 = new Square(9);
xxx(sq2);
System.out.println(sq2.area()); //直接指訣 81
  }
}
