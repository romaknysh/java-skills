package strings;

import java.sql.Struct;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. basic operations ---
        String s = "Hello, World!";
        System.out.println(s.length()); // 13
        System.out.println(s.toUpperCase()); // HELLO, WORLD!
        System.out.println(s.toLowerCase()); // hello, world!
        System.out.println(s.trim()); // remove spaces from start/end

        // --- 2. Access characters ---
        System.out.println(s.charAt(0)); // H
        System.out.println(s.charAt(s.length()-1)); // !

        // --- 3. Substring ---
        System.out.println(s.substring(7)); //World!
        System.out.println(s.substring(7, 12)); // World

        // --- 4. Contains, starts, ends ---
        System.out.println(s.contains("World")); // true
        System.out.println(s.startsWith("Hello")); // true
        System.out.println(s.endsWith("!")); // true

        // --- 5. Replace ---
        System.out.println(s.replace("World", "Java")); // Hello, Java!

        // --- 6. Split ---
        String csv = "Roma,Sofiia,Dima,Zoe";
        String[] names = csv.split(",");
        for (String name : names) System.out.println(name);

        // --- 7. equals vs == ---
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b); // false - compare references
        System.out.println(a.equals(b)); // true - compares content

        // --- 8. indexOf ---
        System.out.println(s.indexOf("World")); // 7 - position of first char
        System.out.println(s.indexOf("xyz")); // -1 - not found

        // --- 9. isEmpty, isBlank ---
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true - only blank

        // --- 10. StringBuilder - efficient string building ---
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");
        System.out.println(sb.toString()); // Hello, World

        // --- 11. String.fromat ---
        String formatted = String.format("Name: %s, Age: %d, Id: %.2f", "Roma", 18, 12529.212);
        System.out.println(formatted);

        // --- 12.Convert types ---
        int num = Integer.parseInt("42");
        double d = Double.parseDouble("2.13");
        String str = String.valueOf(42);
    }
}
