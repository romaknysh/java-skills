package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Task 3
// 1. Create a HashMap<String, List<String>> where key = student name, value = list of subjects
//    add at least 3 students, each with 3 subjects
// 2. Print all students and their subjects
// 3. Add a new subject to one existing student
// 4. Find and print all students who study "Math"
// 5. Count total number of subjects across all students
public class Task3 {
    public static void main(String[] args) {
        HashMap<String, List<String>> students = new HashMap<>();
        List<String> romaSubjects = new ArrayList<>();
        romaSubjects.add("Math");
        romaSubjects.add("Physics");
        romaSubjects.add("Java");
        students.put("Roma", romaSubjects);

        List<String> sofiiaSubjects = new ArrayList<>();
        sofiiaSubjects.add("Math");
        sofiiaSubjects.add("Physics");
        sofiiaSubjects.add("Java");
        students.put("Sofiia", sofiiaSubjects);

        List<String> dimaSubjects = new ArrayList<>();
        dimaSubjects.add("Math");
        dimaSubjects.add("Physics");
        dimaSubjects.add("Java");
        students.put("Dima", dimaSubjects);

        for(Map.Entry<String, List<String>> entry : students.entrySet()){
            System.out.println(entry.getKey() + ": ");
            for (String subj : entry.getValue()) {
                System.out.println(subj);
            }
            System.out.println("-------------");
        }

        students.get("Roma").add("Music");

        System.out.println("-------------");
        System.out.println("who study match: ");
        for(Map.Entry<String, List<String>> entry : students.entrySet()){
            for (String subj : entry.getValue()) {
                if(subj.equals("Math")) System.out.println(entry.getKey());
            }
        }

        HashMap<String, Integer> total_subg = new HashMap<>();
        for(Map.Entry<String, List<String>> entry : students.entrySet()){
            for (String subj : entry.getValue()) {
                if(total_subg.containsKey(subj)) {
                    total_subg.put(subj, total_subg.get(subj)+1);
                } else{
                    total_subg.put(subj, 1);
                }
            }
        }

        int total = 0;
        for (List<String> subjects : students.values()) {
            total += subjects.size();
        }
        System.out.println("Total: " + total);
    }
}