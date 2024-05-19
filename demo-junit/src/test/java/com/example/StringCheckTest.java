package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class StringCheckTest {
  
  @Test
  void testSameString(){
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse(s1 == s2);
    assertNotSame(s1, s2); //asserNotSame -> Not same object


  String s3 = "hello"; //Literal Pool
  assertSame(s1, s3);
  assertEquals(s2, s3);
  }
}
