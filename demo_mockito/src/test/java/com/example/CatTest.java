package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example2.Cat;

public class CatTest {

  @Test
  void TestSum(){
    Cat cat = new Cat();
    Assertions.assertEquals(10,cat.sum(7,3));
  }
  
}
