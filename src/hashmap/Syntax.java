package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. Declaration and initialization ---
        Map<String, Integer> ages = new HashMap<>();

        // --- 2. Put (add / update) ---
        ages.put("Roma", 17);
        ages.put("Sofiia", 18);
        ages.put("Dima", 22);
        ages.put("Roma", 18); // updates existing key

        // --- 3. Get ---
        System.out.println(ages.get("Roma")); // 21
        System.out.println(ages.get("Zoe")); // null

        // --- 4. Check if key exist ---
        System.out.println(ages.containsKey("Sofiia")); // true
        System.out.println(ages.containsKey("Zoe")); // false

        // --- 5. Check if value exists ---
        System.out.println(ages.containsValue(22)); // true

        // --- 6. Remove ---
        ages.remove("Dima");

        // --- 7. Size ---
        System.out.println(ages.size()); // 2

        // --- 8. Iterate over keys ---
        for (String key : ages.keySet()) {
            System.out.println(key + " => " + ages.get(key));
        }

        // --- 9. Iterate over entries ---
        for (Map.Entry<String, Integer> entry : ages.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // --- 10. getOrDefialt - returns defualt if key not found ---
        System.out.println(ages.getOrDefault("Zoe", 0)); // 0

        // --- 11. putIfAbsent - adds only if key doesn't exist ---
        ages.putIfAbsent("Roma", 199); // won't update
        ages.putIfAbsent("Zoe", 18); // will add Zoe

        // --- 12. clear ---
        ages.clear();
        System.out.println(ages.isEmpty()); // true
    }
}
