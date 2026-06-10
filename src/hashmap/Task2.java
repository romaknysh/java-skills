package hashmap;

import java.util.HashMap;
import java.util.Map;

// Task 2
// 1. Create a HashMap<String, String> where key = country, value = capital
//    add: "Slovakia"="Bratislava", "Ukraine"="Kyiv", "Germany"="Berlin", "France"="Paris"
// 2. Print all countries with their capitals
// 3. Find and print the capital of "Ukraine"
// 4. Add a new country of your choice
// 5. Count how many capitals contain the letter "a"
//    hint: value.contains("a")
public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> capitals_of_the_country = new HashMap<>();
        capitals_of_the_country.put("Slovakia", "Bratislava");
        capitals_of_the_country.put("Ukraine", "Kyiv");
        capitals_of_the_country.put("Germany", "Berlin");
        capitals_of_the_country.put("France", "Paris");

        for (Map.Entry<String, String> entry : capitals_of_the_country.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println(capitals_of_the_country.get("Ukraine"));

        capitals_of_the_country.put("Counntry", "Capital");

        int count_a = 0;
        for (Map.Entry<String, String> entry : capitals_of_the_country.entrySet()){
            if (entry.getValue().contains("a")) count_a += 1;
        }

        System.out.println("A: " + count_a);
    }
}