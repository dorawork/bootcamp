package com.example;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    private static final float totalCost = 0;
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
        // TODO: Complete the constructor

    }

    public void addToOrder(final Furniture type, final int furnitureCount) { //5
        // TODO: Complete the method
        int count = 0;
        if (this.ordersOfFurnitures.containsKey(type))  
        count = this.ordersOfFurnitures.get(type);
        this.ordersOfFurnitures.put(type, furnitureCount + count); // 現在COUNT + 之後COUNT數 
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        for (Map.Entry<Furniture, Integer> entry : this.ordersOfFurnitures.entrySet()) {
            // TYPE DATA ,DATA
            float totalCost = 0;
            Furniture furniture= entry.getKey();
            int quantitie = entry.getValue();
            float unitprice = furniture.cost(); //
            float itemprice = quantitie * unitprice;
            totalCost += itemprice;
        }
        return totalCost;
    }
    

    public int getTypeCount(Furniture type) {
        if (this.ordersOfFurnitures.get(type) == null)
        return 0;
        // TODO: Complete the method
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (this.ordersOfFurnitures.get(type) == null)
        return 0;
        return this.ordersOfFurnitures.get(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        int sum = 0;
        for (int x : this.ordersOfFurnitures.values()) {
            sum += x;
        }
        return sum;
    }
        
    }
