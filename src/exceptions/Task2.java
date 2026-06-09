package exceptions;

// Task 2
// 1. Create two custom exceptions: EmptyStringException, TooLongException
// 2. Write a method checkName(String name):
//    - if name is empty → throw EmptyStringException
//    - if name is longer than 10 characters → throw TooLongException
// 3. In main: test all three cases (empty, too long, normal)
//    use try-catch for each call
public class Task2 {
    static class EmptyStringException extends RuntimeException {
        public EmptyStringException(String message) {
            super(message);
        }
    }

    static class TooLongException extends RuntimeException {
        public TooLongException(String message) {
            super(message);
        }
    }

    public static void checkName(String name) {
        if (name.isEmpty()) throw new EmptyStringException("Empty name");
        if (name.length() > 10) throw new TooLongException("Too long");
        else System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            checkName("");
        } catch (EmptyStringException e){
            System.out.println("Caught: " + e.getMessage());
        } catch (TooLongException e){
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            checkName("12345678910");
        } catch (EmptyStringException e){
            System.out.println("Caught: " + e.getMessage());
        } catch (TooLongException e){
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            checkName("123");
        } catch (EmptyStringException e){
            System.out.println("Caught: " + e.getMessage());
        } catch (TooLongException e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
}