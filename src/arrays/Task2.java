package arrays;

import java.util.Arrays;

// Task 2
// 1. Create a 3x3 matrix and fill it with values using the formula: matrix[i][j] = i * 3 + j + 1
//    (should give you 1-9)
// 2. Print the matrix row by row (each row on a new line)
// 3. Calculate and print the sum of the main diagonal (top-left to bottom-right)
//    main diagonal = elements where row index == col index
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i * 3 + j + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        int diagonal = 0;
        for (int i = 0; i < matrix.length; i++){
            diagonal +=  matrix[i][i];
        }

        System.out.println("Diagonal: " + diagonal);
    }
}