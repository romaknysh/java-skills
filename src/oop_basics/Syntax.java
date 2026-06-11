package oop_basics;

public class Syntax {

    // --- 1. Class with private fields, constructor, getters ---
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        // --- 2. toString ---
        @Override
        public String toString() {
            return "Person{name=" + name + ", age=" + age + "}";
        }
    }

    // --- 3. Inheritance ---
    static class Student extends Person {
        private String university;

        public Student(String name, int age, String university) {
            super(name, age); // calls parent constructor
            this.university = university;
        }

        @Override
        public String toString() {
            return "Student{name=" + getName() + ", uni=" + university + "}";
        }
    }

    // --- 4. static field and method ---
    static class Counter {
        private static int count = 0; // shared across all instances
        private int id;

        public Counter() {
            count++;
            this.id = count;
        }

        public static int getCount() { return count; }
        public int getId() { return id; }
    }

    public static void main(String[] args) {
        Person p = new Person("Roma", 20);
        System.out.println(p);
        System.out.println(p.getName());

        Student s = new Student("Anna", 21, "UNIZA");
        System.out.println(s);

        // polymorphism - Student is also a Person
        Person p2 = new Student("Max", 22, "STU");
        System.out.println(p2);

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.getCount()); // 2
        System.out.println(c1.getId());         // 1
        System.out.println(c2.getId());         // 2
    }
}