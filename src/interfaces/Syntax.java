package interfaces;

public class Syntax {

    // --- 1. Basic interface ---
    interface Animal {
        String getSound();      // no body - must be implemented
        String getName();
    }

    // --- 2. Interface with default method ---
    interface Printable {
        void print();

        default void printWithBorder() {  // has body - optional to override
            System.out.println("---");
            print();
            System.out.println("---");
        }
    }

    // --- 3. Implementing interface ---
    static class Dog implements Animal {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String getSound() { return "Woof"; }

        @Override
        public String getName() { return name; }
    }

    // --- 4. Implementing multiple interfaces ---
    static class Cat implements Animal, Printable {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String getSound() { return "Meow"; }

        @Override
        public String getName() { return name; }

        @Override
        public void print() {
            System.out.println(name + " says " + getSound());
        }
    }

    public static void main(String[] args) {

        // --- polymorphism with interface ---
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Whiskers");

        System.out.println(dog.getName() + ": " + dog.getSound());
        System.out.println(cat.getName() + ": " + cat.getSound());

        // --- interface as type ---
        Animal[] animals = {new Dog("Max"), new Cat("Luna")};
        for (Animal a : animals) {
            System.out.println(a.getSound());
        }

        // --- default method ---
        Cat c = new Cat("Mimi");
        c.printWithBorder();
    }
}