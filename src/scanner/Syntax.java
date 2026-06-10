package scanner;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ALWAYS System.in!

        // --- 1. Read a full line ---
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        // --- 2. Read an integer ---
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Age: " + age);

        // --- 3. Read a double ---
        System.out.println("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Price: " + price);

        // --- 4. Split input into parts ---
        // input fromat: "Roma 18"
        System.out.print("Enter name and age: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        String personName = parts[0];
        int personAge = Integer.parseInt(parts[1]);
        System.out.println(personName + " is " + personAge);

        // --- 5. Read until "stop" ---
        System.out.println("Enter words (type 'stop' to stop): ");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equals("stop")) break;
            System.out.println("You entered: " + input);
        }
        sc.close();
    }
}
