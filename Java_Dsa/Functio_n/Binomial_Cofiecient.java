import java.util.Scanner;

public class Binomial_Cofiecient {

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

    public static int binomial(int n, int r){
        int n_fact = calculateFactorial(n);
        int r_fact = calculateFactorial(r);
        int nr_fact = calculateFactorial(n-r);

        int bionomial_value = n_fact/(r_fact*nr_fact);
        return bionomial_value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println(binomial(n, r));

        sc.close();
    }
}
