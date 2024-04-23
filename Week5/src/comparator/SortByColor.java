package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0) ? -1
        : 1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3));
    balls.add(new Ball(Color.YELLOW, 1.3));
    balls.add(new Ball(Color.YELLOW, 2.3));
    balls.add(new Ball(Color.RED, 1.3));
    balls.add(new Ball(Color.RED, 2.3));


    int random = new Random().nextInt(2); // 0 or 1 抽獎 生成0或1的隨機數
    Comparator<Ball> formula = null; //BALL變成NULL
    if (random == 0){
      formula = new SortByColor();// 0 = 創Color
    } else if (random == 1){
      formula = new ShortBySize();// 0 = 創Color
    }
    Collections.sort(balls, formula);
    System.out.println(balls);
  }
}
