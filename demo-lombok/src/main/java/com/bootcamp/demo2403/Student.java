package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor

public class Student {

  @Getter
  @NonNull
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    Student s1 = new Student ("Vincent",5);
    System.out.println(s1.getName());
  
  s1.setAge(5);
  
  Student S2 = new Student("jokhk");
  }
}
