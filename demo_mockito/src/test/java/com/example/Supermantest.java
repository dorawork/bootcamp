package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example2.Cat;
import com.example2.Superman;

@ExtendWith(MockitoExtension.class) // inject a set of annoution
public class Supermantest {

  @Spy
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test
  void testSum() {
    when(cat.sum(98, 10)).thenReturn(1);
    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98, 10); // 睇下下面有冇行過
  }

  @Test
  void testSum2() {
    when(cat.sum(94, 10)).thenReturn(0);
    assertEquals(99, superman.sum(94));
    verify(cat, times(1)).sum(94, 10);
  }
}