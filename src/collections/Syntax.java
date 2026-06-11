package collections;

import java.util.*;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. HashSet - unique values, np order ---
        Set<String> set = new HashSet<>();
        set.add("Roma"); set.add("Sofiia");
        set.add("Roma"); // duplicate - ignored

        System.out.println(set.size()); // 2
        System.out.println(set.contains("Roma")); // true
        set.remove("Roma");

        for (String s : set){
            System.out.println(s);
        }

        // --- 2.LinkedHashMap - keep insertion order ---
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Roma", 95);
        scores.put("Sofiia", 98);
        scores.put("Dima", 90);

        // iterates in insertion order
        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // --- 3. Collections utility class ---
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9)); // same as add(3)....

        System.out.println(Collections.max(numbers)); // 9
        System.out.println(Collections.min(numbers)); // 1
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 1, 3, 4, 5, 9]
        Collections.reverse(numbers);
        System.out.println(numbers); // [9, 5, 4, 3, 1, 1]
        Collections.shuffle(numbers); // random order

        // --- 4. HashSet vs ArrayList ---
        // ArrayList - allows duplicates, has order
        // HashSet - no duplicates, no order
        List<String> list = new ArrayList<>();
        list.add("a"); list.add("a"); list.add("b");
        System.out.println(list); // [a, a, b]

        Set<String> unique = new HashSet<>(list); // remove duplicates
        System.out.println(unique); // [a, b]
    }
}
