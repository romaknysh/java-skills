package scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Task 1
// 1. Read numbers from user until they type "stop"
// 2. Store all numbers in an ArrayList
// 3. After "stop" print:
//    - all numbers
//    - sum of all numbers
//    - average of all numbers
//    - max number
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers or 'stop': ");
        while (true){
            String input = sc.nextLine();
            if(input.equals("stop")) break;
            numbers.add(Integer.parseInt(input));
        }

        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        System.out.println("All nubers: " + numbers);
        System.out.println("SUM of all numbers: " + sum);
        System.out.println("MAX of numbers: " + Collections.max(numbers));
        System.out.println("AVARAGE of numbers: " + (double) sum/numbers.size());
    }
}