package arraylist;

import java.util.ArrayList;
import java.util.List;

// Task 3
// Create a simple shopping cart system
// 1. Create a class Item with fields: name (String), price (double)
//    - constructor, getters
// 2. Create an ArrayList of Items and add at least 5 items
// 3. Print all items with their prices
// 4. Calculate and print total price
// 5. Remove all items that cost more than 50.0
// 6. Print the updated cart and new total
public class Task3 {
    static class Item{
        private String name;
        private double price;

        public Item(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString(){
            return this.name + ": " + this.price;
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item("item1", 123);
        Item item2 = new Item("item2", 12);
        Item item3 = new Item("item3", 13);
        Item item4 = new Item("item4", 40);
        Item item5 = new Item("item5", 455);

        List<Item> items = new ArrayList<>();
        items.add(item1); items.add(item2); items.add(item3); items.add(item4); items.add(item5);

        double total_price = 0;
        for(Item item : items) {
            System.out.println(item.toString());
            total_price += item.getPrice();
        }
        System.out.println("Total price: " + total_price);

        for (int i = items.size()-1; i>= 0; i--) if(items.get(i).getPrice() > 50) items.remove(i);
        total_price = 0;
        for(Item item : items) {
            System.out.println(item.toString());
            total_price += item.getPrice();
        }
        System.out.println("Total price: " + total_price);
    }
}