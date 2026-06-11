package files;

import java.io.*;

// Task 1
// 1. Create a file "students.txt" and write 5 students in format: "name age"
//    example: "Roma 20"
// 2. Read the file and print each student on a new line
// 3. Find and print the oldest student
// 4. Count and print how many students are older than 20
public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }

        String oldest_info = null;
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if(line.isEmpty()) continue;
                if (oldest_info == null){
                    oldest_info = line;
                }
                String[] parts = line.split(" ");
                String[] oldest_elements = oldest_info.split(" ");
                if (Integer.parseInt(parts[1]) > Integer.parseInt(oldest_elements[1])) oldest_info = line;
            }
        } catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }

        System.out.println("Oldest student: " + oldest_info);

        int older_then_20 = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(" ");
                if (Integer.parseInt(parts[1]) > 20) older_then_20+=1;
            }
        }catch (IOException e){
            throw new RuntimeException("Error: ", e);
        }
        System.out.println("Older then 20: " + older_then_20);
    }
}