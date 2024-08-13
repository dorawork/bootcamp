package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoDouble {

  public static void main(String[] args) {
    double result = 0.1d +0.2d;
    System.out.println(result);// 0.30000000000000000004

    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = bd1.add(new BigDecimal("0.2"));
    System.out.println(bd2.doubleValue());// 0.3

    double  d1 = 

    BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println("d1=" + d1); //0.3

    double x = 10.0 / 3.0;
    System.out.println(x); // 3.3333333333333335

    // Non-terminating decimal expansion
    double y = BigDecimal.valueOf(10.0) //
        .divide(BigDecimal.valueOf(3.0), 4, RoundingMode.HALF_UP) //
        .doubleValue();
    System.out.println(y); // 3.3333
    

  }
  
}
