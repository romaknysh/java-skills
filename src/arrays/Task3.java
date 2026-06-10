package arrays;

import java.util.Arrays;

// Task 3
// 1. Create a String array of 5 names: {"Roma", "Anna", "Max", "Zoe", "Bob"}
// 2. Find and print the longest name
// 3. Count how many names start with a vowel (a, e, i, o, u)
//    hint: name.charAt(0) gives first character
//          name.toLowerCase() converts to lowercase
// 4. Reverse the array and print it
//    (without using any library methods - do it manually)
public class Task3 {
    public static void main(String[] args) {
        String[] names = {"Roma", "Anna", "Max", "Zoe", "Bob"};

        int longest = 0;
        int longest_index = 0;
        for (int i = 0; i < names.length; i++){
            if (names[i].length() > longest){
                longest_index = i;
                longest = names[i].length();
            }
        }
        System.out.println("Longest: " + names[longest_index]);

        int vowel_start = 0;
        for (int i = 0; i<names.length; i++){
            char c = Character.toLowerCase(names[i].charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel_start += 1;
            }
        }
        System.out.println("Starts with vowel: " + vowel_start);

        String[] reversed_names = new String[names.length];

        for (int i = 0; i<names.length; i++){
            reversed_names[names.length - 1 - i] = names[i];
        }

        System.out.println("REVERSED: " + Arrays.toString(reversed_names));
    }
}