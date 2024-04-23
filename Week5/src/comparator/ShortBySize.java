package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ShortBySize implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getSize() < b2.getSize() ? -1 : 1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3));
    balls.add(new Ball(Color.YELLOW, 1.3));
    balls.add(new Ball(Color.YELLOW, 2.3));
    balls.add(new Ball(Color.RED, 1.3));
    balls.add(new Ball(Color.RED, 2.3));
    
    Collections.sort(balls, new ShortBySize());
    System.out.println(balls);
  }
}
