package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example2.Cat;
import com.example2.Superman;

@ExtendWith(MockitoExtension.class)
public class Supermantest2  {

  @Mock
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test
  void testSum() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(2);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  @Test
  void testSum2() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(3);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(99, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

}