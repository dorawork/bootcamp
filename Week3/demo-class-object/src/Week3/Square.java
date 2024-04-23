public class Square {

  private int length;

  public String toString() {
    return "Square(length=" + getLength() + ")";
  }

  public void setLength(int x) {
    this.length = x;
  }

  public int getLength() {
    return this.length;
  }

  public int getArea() {
    return getLength() * getLength();
  }
}