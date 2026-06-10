package arrays;
import java.util.Arrays;

public class Syntax {

    public static void main(String[] args){

        // --- 1. Declaration and initialization ---
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = new String[3]; // empty array, size 3
        names[0] = "Roma";
        names[1] = "Sofia";
        names[2] = "Dima";

        // --- 2. Access by index ---
        System.out.println(numbers[0]); // 1
        System.out.println(numbers[numbers.length - 1]); // last element = 5

        // --- 3. Iteration - for loop ---
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        // --- 4. Iteration - for-each ---
        for (String name : names){
            System.out.println(name);
        }

        // --- 5. 2D array ---
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // access element at row 1, col 2
        System.out.println(matrix[1][2]); //6

        // iterate 2D array
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col< matrix[row].length; col++){
                System.out.println(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // --- 6. Initialize 2D array manually ---
        int rows = 3;
        int cols = 3;
        int[][] grid = new int[rows][cols]; // all zeros by default
        grid[0][0] = 5;
        grid[1][2] = 9;

        // --- 7. Useful: find max in array ---
        int max = numbers[0];
        for (int n : numbers){
            if(n > max) max = n;
        }
        System.out.println("Max: " + max);

        // --- 8. Arrays class methods ---

        // sort
        int[] toSort = {5, 2, 8, 1, 9};
        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort)); // [1, 2, 5, 8, 9]

        // fill
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println(Arrays.toString(filled)); // [7, 7, 7, 7, 7]

        // copyOf
        int[] copy = Arrays.copyOf(toSort, toSort.length);

        // copyOfRange - copies index 1,2,3
        int[] part = Arrays.copyOfRange(toSort, 1, 4);
        System.out.println(Arrays.toString(part));

        // binarySearch - array must be sorted first!
        int index = Arrays.binarySearch(toSort, 8);
        System.out.println("Index of 8: " + index);

    }
}
