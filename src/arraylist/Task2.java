package arraylist;

import java.util.ArrayList;
import java.util.List;

// Task 2
// 1. Create an ArrayList of Strings: {"apple", "banana", "cherry", "avocado", "blueberry"}
// 2. Print all elements that start with "a"
// 3. Create a NEW list with only elements longer than 6 characters
// 4. Print the new list
public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple"); words.add("banana"); words.add("cherry");
        words.add("avocado"); words.add("blueberry");

        for (int i = 0; i < words.size(); i++) if(words.get(i).startsWith("a")) System.out.println(words.get(i));

        List<String> long_words_list = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) if(words.get(i).length() > 6) long_words_list.add(words.get(i));
        System.out.println(long_words_list);

    }


}