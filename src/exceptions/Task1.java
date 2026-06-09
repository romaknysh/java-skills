package exceptions;

// Task 1
// 1. Create a custom exception called TooOldException
// 2. Write a method checkAge(int age) - if age > 150, throw the exception
// 3. In main: call checkAge(200) inside try-catch and print the message
public class Task1 {
    static class TooOldException extends RuntimeException {
        public TooOldException(String message){
            super(message);
        }
    }

    public static void checkAge(int age){
        if (age>150){
            throw new TooOldException("Too old srry: " + age);
        }
        System.out.println("OK: " + age);
    }

    public static void main(String[] args){
        try {
            checkAge(200);
        }catch (TooOldException e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
}