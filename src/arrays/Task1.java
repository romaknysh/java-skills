package arrays;
import java.util.Arrays;

// Task 1
// 1. Create an array of 6 integers: {3, 1, 4, 1, 5, 9}
// 2. Print the array using Arrays.toString()
// 3. Sort the array and print it again
// 4. Find and print the minimum and maximum value
// 5. Calculate and print the sum of all elements
public class Task1 {
    public static void main(String[] args) {
        // 1
        int[] array_numbers = {3, 1, 4, 1, 5, 9};

        // 2
        System.out.println(Arrays.toString(array_numbers));

        // 3
        Arrays.sort(array_numbers);
        System.out.println(Arrays.toString(array_numbers));

        // 4 & 5
        int min = array_numbers[0];
        int max = array_numbers[0];
        int sum = 0;
        for (int n : array_numbers){
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }

        System.out.println("min: " + min + "\n"
                + "max: " + max + "\n" +
                "SUM: " + sum);

    }
}