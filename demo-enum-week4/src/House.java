public class House {

  private Direction direction;

  public House(Direction direction) {
  this.direction = direction;
  }

  public Direction getDirection() {
    return this.direction;
  }

  public void setDirection(Direction direction) { //修改用途
    this.direction = direction;
  }
}