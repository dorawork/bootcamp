package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example2.Calculator;
import com.example2.Cat;

@ExtendWith(MockitoExtension.class) // inject a set of annoution
public class Calclatortest {

  @Mock
  private Cat cat;
  // new Cat() ?

  @Test
  void testCalculatorSum(){
    //let / assume "cat.sum(8,10)" return 100 將OBJECT改變結果
    Mockito.when(this.cat.sum(8,10)).thenReturn(100);

    Calculator calclator = new Calculator(8, cat);
    int result = calclator.sum(); // -> new cat (8,10).sum()
    assertEquals(103, result);// not  21
  }


  
}
