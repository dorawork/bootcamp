package Customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {

  private String orderNo;

  private Item[] items; //arrays

  public Order(String orderNo, Item[] items) {
    this.orderNo = orderNo;
    this.items = items;
  }
//唔想比人知ARRATY
  public double total(){
    BigDecimal total = BigDecimal.valueOf(0.0d){
      for (int i = 0; i < items.length; i++){
        total = total.add(BigDecimal.valueOf(items[i].subtotal()));

      }
    }
  }
  public void add(Item item) {
    Item[] copyArr = this.items;
    this.items = new Item[this.items.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      items[idx++] = copyArr[i];
    }
    items[idx] = item;
  }

  public String toString() {
    return "Order(" //
        + "orderNo=" + this.orderNo //
        + ", items=" + Arrays.toString(this.items) //
        + ")";
  }

}