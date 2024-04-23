package objects;

import java.util.Objects;

public class College {

  private double area;

  public double getArea() {
    return this.area;
  }

  // eqalls()
  // hashCode()

  @Override //
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof College))
      return false;
    College c = (College) obj;
    return Objects.equals(this.area, c.getArea());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.area);
  }
  @Override
  public String toString(){
    return "College("
    +"area= " + area //
    + ")"; 
  }
  College c2 = (College) o ;
  Class<?> s = o.getClass();
  System.out.println(s.getName());

  public static void main(String[] args) {
    Object o = new College(); // Polymorphism
    // College c = new Object(); //NOT OK
    // College c = new College(): // OK
    /* o.hashCode();
    o.equals(new College()); */

    if (o instanceof College) {
      College c2 = (College) o;
    }
  }
}
