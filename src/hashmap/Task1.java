package hashmap;

import java.util.HashMap;
import java.util.Map;

// Task 1
// 1. Create a HashMap<String, Integer> of word counts
//    add: "apple"=3, "banana"=5, "cherry"=1, "apple"=7 (update apple)
// 2. Print all entries
// 3. Print the count of "banana"
// 4. Check if "cherry" exists and print result
// 5. Remove "banana" and print the updated map
public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> word_counts = new HashMap<>();
        word_counts.put("apple", 3); word_counts.put("banana", 5); word_counts.put("cherry", 1); // put
        word_counts.put("apple", 7); // update

        for (Map.Entry<String, Integer> entry : word_counts.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println(word_counts.get("banana"));

        System.out.println(word_counts.containsKey("cherry"));

        word_counts.remove("banana");
        for (Map.Entry<String, Integer> entry : word_counts.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}