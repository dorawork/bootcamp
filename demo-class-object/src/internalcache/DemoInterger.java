package internalcache;

public class DemoInterger {

  public static void main(String[] args) {
    
  //SUPPORT - 127內
  Integer i1 = Integer.valueOf(127);
  Integer i2 = Integer.valueOf(127);
  System.out.println(i1 == i2); //true
  System.out.println(System.identityHashCode(i1));
  System.out.println(System.identityHashCode(i2));

  Integer i3 = Integer.valueOf(128);
  Integer i4 = Integer.valueOf(128);
  System.out.println(i3 == i4); //false
  System.out.println(System.identityHashCode(i3));
  System.out.println(System.identityHashCode(i4));

  Float f1 = Float.valueOf(128);
  Float f2 = Float.valueOf(128);
  System.out.println(f1 == f2); //false
  System.out.println(System.identityHashCode(f1));
  System.out.println(System.identityHashCode(f2));

  Character c1 = Character.valueOf('z');
  Character c2 = Character.valueOf('z');
  System.out.println(c1 == c2); //true

  Character c3 = Character.valueOf('$');
  Character c4 = Character.valueOf('$');
  System.out.println(c3 == c4); //true

  }
}