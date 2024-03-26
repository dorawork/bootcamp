package Workspace.week1;

public class Operator {
  public static void main(String[] args) {
    //increment
    int x = 1;
    x = x + 1; // x + 1 -> 1+1
    x = x + 1; // = 2+1 ->3
    System.out.println(x);

    int e =10;
    e--; //9
    --e; //8
    e = e-1; //7
    e-= 1; //6

    int predecrement = --e; //predecrement =5
    System.out.println(predecrement);

    int postdecrement = e--; //e=5 
    System.out.println(postdecrement);
    System.out.println(e); //e=4
    
  }
}
