package Week6.DemoLambda.bulitin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

  public static void main(String[] args) {
    Supplier<String> hello = () -> "hello";
    System.out.println(hello.get());

    Supplier<Weekday> monday = () -> Weekday.FRIDAY;
    Weekday monday2 = Weekday.FRIDAY;

    printName(() -> Weekday.FRIDAY);//FRIDAY

    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());//LocalDate.now

    Supplier<Integer> random = () -> new Random().nextInt(10) +1;//0-9 +1 ->0-10
    System.out.println(random.get());//隨機
  }

  public static void printName(Supplier<Weekday> weekday) {
    System.out.println(weekday.get());
  }
}
