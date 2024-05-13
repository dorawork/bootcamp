package com.bootcamp.demo2403;

import lombok.Data;
import lombok.NonNull;

@Data //@RequiredArgsConstructor, @ToString, @EqualsAndHashCode, @Getter, @Setter
public class Book {

  private String name;
  @NonNull
  private Color color;
  
  public static void main(String[] args) {
    Book b1 = new Book(color.black);
    b1.setColor(color RED);;
    b1.setName("abc");
    System.out.println(b1.toString());
  }
}
