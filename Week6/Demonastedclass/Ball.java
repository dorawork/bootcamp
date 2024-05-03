package Week6.Demonastedclass;

public class Ball {
  private Color color;
  private double weight;

  public enum Color {
    RED, YELLOW, BLACK,;
  }
  
  private Ball(BallBuilder ballBuilder) {
    this.color = ballBuilder.color;
    this.weight = ballBuilder.weight;
  }

  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ", weight=" + this.weight //
        + ")";
  }

  public static BallBuilder builder() {
    return new BallBuilder();
  }

  // Builder Pattern (Coding Pattern)
  // 1. avoid setter, so that I can create ball object with all attribute values
  // 2. avoid all-args constructor ()
  public static class BallBuilder {
    private Color color;
    private double weight;

    public BallBuilder setColor(Color color) { // chain method
      this.color = color;
      return this;
    }

    public BallBuilder setWeight(double weight) { // chain method
      this.weight = weight;
      return this;
    }

    public Ball build() {
      return new Ball(this);
    }
  }

  public static void main(String[] args) {
    Ball ball = new Ball.BallBuilder() // empty constructor of BallBuilder
        .setColor(Color.RED) //
        .setWeight(30.0d) //
        .build();
    System.out.println(ball); // Ball(color=RED, weight=30.0)

    Ball ball2 = Ball.builder() //
        .setColor(Color.RED) //
        .setWeight(30.0d) //
        .build();
    System.out.println(ball2);
  }
}