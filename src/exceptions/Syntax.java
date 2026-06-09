package exceptions;

public class Syntax {

    // --- 1. Custom exception ---
    // extends RuntimeException = unchecked (no need to declare throws)
    static class NegNumbrException extends RuntimeException {
        public NegNumbrException(String message){
            super(message);
        }
    }

    static class EmptyNameException extends RuntimeException {
        public EmptyNameException(String message){
            super(message);
        }
    }

    // --- 2. Throwing an exception ---
    static void checkPositive(int number) {
        if (number < 0){
            throw new NegNumbrException("Number canot be negative: " + number);
        }
        System.out.println("OK: " + number);
    }

    // --- 3. try-catch ---
    static void tryCatchExample(){
        try{
            checkPositive(-5);
        } catch (NegNumbrException e){
            System.out.println("Caught: " + e.getMessage());
        }
    }

    // --- 4. try-catch-finally ---
    // finally always runs, even if exception is thrown
    static void finallyExample(){
        try{
            checkPositive(-1);
        } catch (NegNumbrException e){
            System.out.println("Caught: " + e.getMessage());
        }finally {
            System.out.println("This always runs");
        }
    }

    // --- 5. Multiple catch blocks ---
    static void multipleCatch(int number, String name){
        try {
            if(number < 0) throw new NegNumbrException("Negative: " + number);
            if (name.isEmpty()) throw new EmptyNameException("Name is empty");
        } catch (NegNumbrException e){
            System.out.println("Number error: " + e.getMessage());
        } catch (EmptyNameException e){
            System.out.println("Name error: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        System.out.println("=== try-catch ===");
        tryCatchExample();

        System.out.println("\n=== finally ===");
        finallyExample();

        System.out.println("\n=== multiple catch===");
        multipleCatch(-18, "Roma");
        multipleCatch(18, "");
    }
}
