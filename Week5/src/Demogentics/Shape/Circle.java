package Week5.src.Demogentics.Shape;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'area'");
  }

}
