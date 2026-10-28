
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
