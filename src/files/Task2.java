package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Task 2
// 1. Read "students.txt" file
// 2. Write to a new file "adults.txt" only students older than 18
// 3. Read "adults.txt" and print its contents to verify
public class Task2 {
    public static void main(String[] args) {
        List<String> adults = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(" ");
                if (Integer.parseInt(parts[1]) > 18){
                    adults.add(line);
                }
            }
        }catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }

        try(BufferedWriter br = new BufferedWriter(new FileWriter("adults.txt"))){
            for(String adult : adults){
                br.write(adult+"\n");
            }
        } catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }

        System.out.println("adults: ");
        try (BufferedReader br = new BufferedReader(new FileReader("adults.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }
    }
}