package Week6.DemoOptinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {
  
  private Optional<String> name;

  public Optional<String> getName() { // getName() well-know method 自己運算 Optional -> RETURN TYPE
    return this.name;
  }
  public static void main(String[] args) {
  List<String> names = new ArrayList<>(List.of("Vincent", "Jerry", "Oscar"));
  // stream
  List<Optional<String>> result = names.stream()//
      .map(e -> Optional.ofNullable(e))
      .collect(Collectors.toList());

    }

  // deserialization / serialization 序列化
  // {
  // "name" : "John"
  // }

  // Jave Object <-> JSON (序列化)
  // Opitonal<T> cannot be supported

  // 未抄好 empty
  public static Double sum(Double d1, Double d2) {
    if (d1 == null || d2 == null)
      throw new IllegalArgumentException();
  }
}
