package loacaldate.loacaldate.java;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Random;

// Java Project/File: Auto-imported - > java.lang (Math)

public class DemoDate {

  public static void main(String[] args) {
    
    LocalDate day = LocalDate.of(2023, 12, 1);
    System.out.println(day.toString());//2023-12-01

    LocalDate day2 = LocalDate.parse("2023-12-01");
    System.out.println(day2.toString());//2023-12-01

    System.out.println(day == day2);// false
    System.out.println(day.compareTo(day2));// 0
    System.out.println(day.isEqual(day2));// true
    
    System.out.println(day.isAfter(LocalDate.of(2023, 11, 30)));
    
    System.out.println(day.isBefore(LocalDate.of(2023, 11, 30)));  

    int year = day.getYear();
    Month month = day.getMonth();
    System.out.println(month.length(false)); //31
    System.out.println(month.of(2).length(false));// 28 檢2月有幾多日

    Year y1 = Year.of(2024);
    System.out.println(y1.isLeap());

    System.out.println(day.getDayOfWeek().toString());//Friday check 星期

    int random = new Random().nextInt(3); //0 - 2

    System.out.println(day.plusDays(31).toString());//2024-01-01
    LocalDate day3 = day.plusMonths(2);
    LocalDate today = LocalDate.now(); //今日幾多號


  }
  
}
