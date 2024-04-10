package Staticmethod.src;

public class PR {
  
  public static void main(String[] args) {
    double[] prices = new double[] {2.0, 3.2, 5.1};
    int[] quantities = new int[] {2, 4, 5};

    double totalAmount = total(prices, quantities);
    
    System.out.println("totalAmount=" + totalAmount); // 4 + 12.8 + 25.5 =42.3
  }

  public static double total(double[] prices, int[] quantities){
    double totalAmount = 0.0d;
    for (int i = 0 ; i < prices.length;i++){
      totalAmount += subTotal(prices[i], quantities[i]);
    }
    return totalAmount;
  }

    public static double subTotal(double prices, int quantities){
      return prices * quantities;
    }
  }
