package com.bootcamp.demo2403;

import lombok.Data;
import lombok.NonNull;

@Data //@RequiredArgsConstructor, @ToString, @EqualsAndHashCode, @Getter, @Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Book {

  private String name;
  @NonNull
  private Color color;
  
  public static void main(String[] args) {
    Book b1 = new Book(Color.BLOCK); // Book 用了Color eunm
    b1.setColor(Color.RED);
    b1.setName("abc");
    System.out.println(b1.toString()); 
  }
}
