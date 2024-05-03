package src.demo_list;

import java.util.HashSet;
import java.util.Objects;

public class Staff {

  private String name;

  public Staff(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "Staff(" //
        + "name is" + this.name //
        + ".)";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Staff))
      return false;
    Staff staff = (Staff) obj;
    return Objects.equals(this.name, staff.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  public static void main(String[] args) {
    HashSet<Staff> staffs = new HashSet<>();
    staffs.add(new Staff("HR"));
    staffs.add(new Staff("he"));
    System.out.println(staffs.size()); // 2
    System.out.println(staffs.isEmpty());// false
    System.out.println((staffs));

    // add -> false
    System.out.println(staffs.add(new Staff("ihf")));
    System.out.println(staffs.size());


    

  }
}
