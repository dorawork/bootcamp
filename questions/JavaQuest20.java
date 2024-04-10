package questions;
/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * the input need to be lowercase English letters.
 */
public class JavaQuest20 {

  private String s;

  private String goal;

public JavaQuest20 (String s, String goal){
  this.s = s;
  this.goal = goal;
}

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    // code here ...
    if (s.length() == goal.length()) {//長度?
      return true;
    }
    return false;
    }

  }
