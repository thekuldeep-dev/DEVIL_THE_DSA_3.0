import java.util.Scanner;

public class factorial {

    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative numbers is not defined.");
            return -1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = calculateFactorial(num);

        if (result != -1) {
            System.out.println("Factorial: " + result);
        }

        sc.close();
    }
}
