package files;

import java.io.*;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. Write to file ---
        try (PrintWriter writer = new PrintWriter(new FileWriter("test.txt"))){
            writer.println("Hello");
            writer.println("World");
            writer.println("Java");
        } catch (IOException e){
            throw new RuntimeException("Error writing file ", e);
        }

        // --- 2. Read from file - line by line ---
        try (BufferedReader br = new BufferedReader((new FileReader("test.txt")))){
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e){
            throw new RuntimeException("Error reading file ", e);
        }

        // --- 3. Read and split ---
        // file format: "Roma 18"
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(" ");
                System.out.println("First word: " + parts[0]);
            }
        } catch (IOException e){
            throw new RuntimeException("Error reading file ", e);
        }

        // --- 4. Read integers from file ---
        // file format: "1 2 3 4 5" on one line
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String line = br.readLine();
            String[] parts = line.split(" ");
            for (String part : parts){
                System.out.println(Integer.parseInt(part));
            }
        } catch (IOException e){
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
