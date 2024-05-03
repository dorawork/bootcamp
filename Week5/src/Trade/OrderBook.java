package Trade;

import java.util.Map;

public class OrderBook {

  private int marketIndex; //2 -> Buy_1 $$ Sell_1 $$

  private Map<Double, Integer> entries; // no ordering

  // assumption $1 - $2, $0.05
  // Buy, your price < market price
  // Buy, your price >= market price
  // Sell, your price > market price
  // Sell, your price <= market price

  // Buy
  // $10 2q (1) -> trade (Vincent/ Oscar 1q at $10)
  // $2 998q

  // Sell
  // $11 1q (1)
  // $13 100q (1)

  // Market Price -> the price of the last trade in the market
  
}
