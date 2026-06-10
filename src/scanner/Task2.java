package scanner;

import java.util.Scanner;

// Task 2
// Simple calculator
// 1. Read two numbers from user
// 2. Read operation: "add", "subtract", "multiply", "divide"
// 3. Print the result
// 4. If user tries to divide by zero - print error message
// 5. Repeat until user types "exit"
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Write first number (or 'exit'): ");
            String frirst = sc.nextLine();
            if (!frirst.equals("exit")) {
                Integer frirst_num = Integer.parseInt(frirst);
                System.out.println("Write second number: ");
                String second = sc.nextLine();
                if (!second.equals("exit")) {
                    Integer second_num = Integer.parseInt(second);
                    System.out.println("Write operation: ");
                    String operation = sc.nextLine();
                    if (!operation.equals("exit")) {
                        switch (operation) {
                            case "add":
                                System.out.println(frirst_num + " + " + second_num + " = " + (frirst_num + second_num));
                                break;
                            case "subtract":
                                System.out.println(frirst_num + " - " + second_num + " = " + (frirst_num - second_num));
                                break;
                            case "multiply":
                                System.out.println(frirst_num + " * " + second_num + " = " + (frirst_num * second_num));
                                break;
                            case "divide":
                                if (second_num == 0) {
                                    System.out.println("Error: division by zero");
                                } else {
                                    System.out.println(frirst_num + " / " + second_num + " = " + (frirst_num / second_num));
                                } break;
                        }
                    } else break;
                } else break;
            } else break;
        }
    }
}