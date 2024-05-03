package Week6.DemoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
private String name;
private String category;
private double price;
private int quantity;

public Product(String name, String category, double price, int quantity){
  this.name = name;
  this.category = category;
  this.price = price;
  this.quantity = quantity;
  this.price = price;
}

public String getName(){
  return this.name;
}

public double getPrice(){
  return this.price;
}

public int getQuantity(){
  return this.quantity;
}

  public static void main(String[] args) {
  List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200, 5));
        products.add(new Product("Book", "Stationery", 500, 10));
        products.add(new Product("Watch", "Fashion", 1500, 3));
        products.add(new Product("Headphones", "Electronics", 800, 8));
        products.add(new Product("Shoes", "Fashion", 2000, 2));

        List<String> result = products.stream()//
        .filter(e -> e.getPrice() > 1000)//
        .sorted((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
        .map (e - > e.getName)
        .collect (Collectors.toList());

        e.getName().concat("-")
        .concat(String.valueOf(e.getQuantity()))) //
        //Stream
        //1. Filter all products with price >1000
        //2. sort ascending  order by name (done by lambda expression
        //3. map the result set to a list of string "Laptop-5"
        //4. Collect to List<String>
      }
  public int getAmount() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
  }
}
