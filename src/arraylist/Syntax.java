package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. Declaration and initialization ---
        List<String> names = new ArrayList<>(); // always initialize with new ArrayList<>()!

        // --- 2. Add elements ---
        names.add("Roma");
        names.add("Sofiia");
        names.add("Max");
        names.add(0, "Dima"); // add at specific index

        // --- 3. Get element ---
        System.out.println(names.get(0)); // Dima

        // --- 4. Size ---
        System.out.println(names.size()); // 4

        // --- 5. Remove ---
        names.remove("Roma"); // remove by value
        names.remove(0); // remove by index

        // --- 6. Check if exists ---
        System.out.println(names.contains("Max")); // true

        // --- 7. Check if empty ---
        System.out.println(names.isEmpty()); // false

        // --- 8. for-each ---
        for (String name : names){
            System.out.println(name);
        }

        // --- 9. for loop with index ---
        for (int i = 0; i < names.size(); i++){
            System.out.println(i + ": " + names.get(i));
        }

        // --- 10. Sort ---
        Collections.sort(names);

        // --- 11. Clear ---
        names.clear();
        System.out.println(names.isEmpty()); // true

        // --- 12. ArrayList of integers ---
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println(numbers);  // [2, 5, 8]
    }
}
