import java.util.Scanner;

public class SwappingTwoNumbers {

    /*
     * ------------------ CALL BY VALUE (DEFINITION) ------------------
     * Java uses *Call by Value*. This means:
     * → When we pass a variable to a method, Java sends ONLY its value,
     *   NOT the original variable itself.
     *
     * So any change done inside the method affects ONLY the copy,
     * NOT the original variable in main().
     *
     * Example:
     * int a = 10, b = 20;
     * swap(a, b);
     *
     * Inside swap(): a = 20, b = 10   (only copies changed)
     * In main():     a = 10, b = 20   (originals remain same)
     * ---------------------------------------------------------------
     */

    // This method swaps the values of num1 and num2 (but only copies)
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping inside swap() method:");
        System.out.println("a : " + num1 + "; b : " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\nBefore swapping in main():");
        System.out.println("a : " + a + "; b : " + b);

        // Calling swap() method → only copies are swapped
        swap(a, b);

        System.out.println("\nAfter calling swap() (back in main):");
        System.out.println("a : " + a + "; b : " + b);
        System.out.println("(Values remain same because Java is CALL BY VALUE)");

        sc.close();
    }
}
