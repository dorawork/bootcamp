public class DemoMethodArray {

  public static void main(String[] args) {
    double[] prices = new double[] {2.0, 3.2, 5.1};
    int[] quantities = new int[] {2, 4, 5};

    double totalAmount = total(prices, quantities);
    System.out.println("totalAmount=" + totalAmount); // 4 + 12.8 + 25.5
  }

  // Method: totalAmount -> call subTotal()
  public static double total(double[] prices, int[] quantities) {
    double totalAmount = 0.0d;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += subTotal(prices[i], quantities[i]);
    }
    return totalAmount;
  }
    String [] ss = new String []{"a a a", "b bb"};

    public static String trimSpace(String s){
      return s.replace(" " , " ");

    }

  //return {"aa", "bbb"}
  public static String [] trimSpace(String[] ss){ ..pass bu regrenec (addrss)
    String []strings = new String (ss.length);
    for (int i = 0 : i < string.length; i ++){
      strings[i] = ss[1].replace("" , "");
    }
    return strings;
  }

  public static Ingerts = sum *
  // Method: subTotal(double price, int quantity)
  public static double subTotal(double price, int quantity) {
    return price * quantity; // double value * double value
  }
}