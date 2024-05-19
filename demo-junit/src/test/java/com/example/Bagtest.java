package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.example.big.Bag;
import com.example.big.Ball;
import com.example.big.Color;

class BagTest {

  @Test
  void testBagConstructor() {
    Bag b1 = new Bag();
    Bag B2 = new Bag();
    assertEquals(B2.getBalls(),0 );
    assertNotNull(b1.getBalls());
  }


  @Test
  void testBag() {
    Bag b1 = new Bag();
    b1.add(3, Color.BLUE);
    b1.add(4, Color.WHILE);
    b1.withdraw();
    assertEquals(b1.size(), 1);
  }

  @Test
  void testNoOfTimeOfWithdrawMoreThanTheBallInTheBag() {
    Bag b1 = new Bag();
    assertDoesNotThrow(() -> {
      b1.add(3, Color.BLUE);
      b1.add(4, Color.WHILE);
      b1.withdraw();
      b1.withdraw();
    });
    assertThrows(IllegalStateException.class, () -> b1.withdraw());
    assertEquals(b1.size(), 0);
  }

  @Test
  void testBag3() {
    Bag b1 = new Bag();
    b1.add(3, Color.BLUE);
    Ball ball = b1.withdraw();
    assertAll( //
        () -> assertEquals(Color.BLUE, ball.getColor()), //
        () -> assertEquals(3, ball.getValue()) //
    );


  }
}