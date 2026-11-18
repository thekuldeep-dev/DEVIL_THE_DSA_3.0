// Custom exception class
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class TestAgeException {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("You are not eligible to vote!");
            }
            System.out.println("You are eligible to vote.");
        }
        catch (AgeException e) {
            System.out.println("Caught custom exception:");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Age checking completed.");
        }
    }
}