package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Task 1
// 1. Create an ArrayList of integers and add: 10, 5, 8, 3, 7, 1
// 2. Print the list
// 3. Remove all numbers less than 5
//    hint: iterate with regular for loop backwards to avoid skipping elements
//          or collect indexes to remove first
// 4. Sort and print the result
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbrs = new ArrayList<>();
        numbrs.add(10);
        numbrs.add(5);
        numbrs.add(8);
        numbrs.add(3);
        numbrs.add(7);
        numbrs.add(1);
        System.out.println(numbrs);

        for (int i = numbrs.size() - 1; i >= 0; i--) if(numbrs.get(i) < 5) numbrs.remove(i);
        System.out.println(numbrs);

        Collections.sort(numbrs);
        System.out.println(numbrs);

    }
}