package optional;

import java.util.Optional;

public class Syntax {
    public static void main(String[] args) {

        // --- 1. Crete Optional ---
        Optional<String> witchValue = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null); // safe - won't throw

        // --- 2. isPresent / isEmpty ---
        System.out.println(witchValue.isPresent()); // true
        System.out.println(empty.isPresent()); // false
        System.out.println(empty.isEmpty()); // true

        // --- 3. get - only if isPresent! ---
        if (witchValue.isPresent()){
            System.out.println(witchValue.get());
        }

        // --- 4. orElse - default value if empty
        String result = empty.orElse("defuallt");
        System.out.println(result); // default

        // --- 5. ifPresent - run code only if value exists ---
        witchValue.ifPresent(v -> System.out.println("Value is: " + v));

        // --- 6. Common pattern in exam tasks ---
        // method returns Optional
        Optional<String> found = findName("Roma");
        if (found.isPresent()) {
            System.out.println("Found: " + found.get());
        } else {
            System.out.println("Not found");
        }
    }

    // returns Optional - either value or empty
    static Optional<String> findName(String name) {
        String[] names = {"Roma", "Anna", "Max"};
        for (String n : names) {
            if (n.equals(name)) return Optional.of(n);
        }
        return Optional.empty();
    }

    // --- 7. Optional as return type in a class - common in exams ---
    // instead of returning null, return Optional
    // BAD:
    // public Sektor getSektor(int x, int y) {
    //     if (x < 0) return null; // dangerous - causes NullPointerException
    // }

    // GOOD:
    // public Optional<Sektor> getSektor(int x, int y) {
    //     if (x < 0) return Optional.empty();
    //     return Optional.of(mapa[y][x]);
    // }

    // calling it:
    // Optional<Sektor> opt = mapa.getSektor(x, y);
    // if (opt.isPresent()) {
    //     Sektor s = opt.get();
    //     s.doSomething();
    // }
}
