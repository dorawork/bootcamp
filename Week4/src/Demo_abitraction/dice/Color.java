package Demo_abitraction.dice;

public enum Color { //整骰子

  RED(1), YELLOW(2), BLACK(3), WHITE(4), PINK(5), BLUE(6);

  private Color(int value) {
    this.value = value;
  }

  private int value;

  public int getValue() {
    return this.value;
  }

}
