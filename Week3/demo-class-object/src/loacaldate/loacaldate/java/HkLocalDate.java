package loacaldate.loacaldate.java;

import java.time.LocalDate;

public class HkLocalDate {
  
  private LocalDate date;

  private LocalDate [] hoilday;

  public HkLocalDate(int year , int month , int day){ //new HkLocalDate(2020, m1, -1)
this.date = LocalDate.of(year, month, month);

 public HkLocalDate tommorrow(){
  this.date=this.date.plusday(1);
  return this;
 }
  }
}
