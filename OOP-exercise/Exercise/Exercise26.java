import java.util.HashMap;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int).
 * Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: 
 * Before change: 
 * 1 = Apple 
 * 3 = Strawberry
 * 
 * After change: 
 * 1 = APPLE, price = 20 
 * 3 = STRAWBERRY, price = 70
 */
class Exercise26 {

    // finite number of instances
    enum Fruit {
        Apple, Strawberry,Orange;
        // code here
    }

    public static void main(String[] args) {
        // initialize a HashMap
        HashMap<Integer, String> foodTable = new HashMap<>();

        // Add elements using put method
        foodTable.put(1, "Apple");
        foodTable.put(3, "Strawberry");
        foodTable.put(2, "Orange");


        // Remove elements 2
        foodTable.remove(2);
        System.out.println(foodTable);
        
        // Iterate the map using
        // for-each loop
        // Iterating HashMap through for loop
        foodTable.put(1, foodTable.get(1) + ", price = 20");
        foodTable.put(3, foodTable.get(3) + ", price = 70");

        for (Map.Entry<Integer, String> set : foodTable.entrySet()) {
            
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }
}
