package shape;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {// 睇下部電腦狀態是否一樣, 有5個條件, 酬紅有GET

  private double inch;

  private double cpu;

  private double ram;

  private double disk;

  private String color;

  public MacbookAir(double inch, double cpu, double ram, double disk, String color) {
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.disk = disk;
    this.color = color;
  }

  public double getInch() {
    return this.inch;
  }

  public double getCPU() {
    return this.cpu;
  }

  public double getRam() {
    return this.ram;
  }

  public double getDisk() {
    return this.disk;
  }

  public String getColor() {
    return this.color;
  }

  @Override // 背 YES OR NO
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir ma = (MacbookAir) obj;
/*     return this.inch == ma.getInch()//
        && this.cpu == ma.getCPU()//
        && this.ram == ma.getRam()//
        && this.disk == ma.getDisk()//
        && this.color == ma.getColor(); */
        return Objects.equals(this.inch, ma.getInch())
        && Objects.equals(this.cpu, ma.getCPU())
        && Objects.equals(this.ram, ma.getRam())
        && Objects.equals(this.disk, ma.getDisk())
        && Objects.equals(this.color, ma.getColor());
  }

  @Override
  public int hashCode() { // 改寫 68,69 = equals check 睇 object 係唔係一唔一樣 ,切片
    return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
  }

  public static void main(String[] args) {
    MacbookAir ma1 = new MacbookAir(1, 2, 3, 4, "red");
    MacbookAir ma2 = new MacbookAir(1, 2, 3, 4, "red");
    System.out.println(ma1.equals(ma2));// true
    System.out.println(ma1 == ma2);// false

    System.out.println(ma1.hashCode());// 1159190947 Object .class
    System.out.println(ma2.hashCode());// 925858445 有功能比人CALL我地

    System.out.println(System.identityHashCode(ma1)); // 1159190947 check address
    System.out.println(System.identityHashCode(ma2)); // 925858445 check address

    // Sorting 自動排序
    int[] arr = new int[] { 10, 5, 3, 4 };
    Arrays.sort(arr);// merge short, ascending sorting
    System.out.println(Arrays.toString(arr));

  }
}
