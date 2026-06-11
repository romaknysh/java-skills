package generics;

import java.util.ArrayList;
import java.util.List;

public class Syntax {

    // --- 1. Generic class ---
    // T is a type parameter - can be any type
    static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() { return value; }

        @Override
        public String toString() {
            return "Box{" + value + "}";
        }
    }

    // --- 2. Generic class with two type parameters ---
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }

        @Override
        public String toString() {
            return key + " → " + value;
        }
    }

    // --- 3. Generic method ---
    static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // --- 4. Bounded type parameter ---
    // T must be a Number (Integer, Double, etc.)
    static <T extends Number> double sum(List<T> list) {
        double total = 0;
        for (T item : list) {
            total += item.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

        // --- Box with different types ---
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);
        System.out.println(stringBox); // Box{Hello}
        System.out.println(intBox);    // Box{42}

        // --- Pair ---
        Pair<String, Integer> pair = new Pair<>("Roma", 20);
        System.out.println(pair); // Roma → 20

        // --- generic method ---
        String[] names = {"Roma", "Anna", "Max"};
        Integer[] numbers = {1, 2, 3};
        printArray(names);
        printArray(numbers);

        // --- bounded type ---
        List<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(3);
        System.out.println(sum(ints)); // 6.0
    }
}