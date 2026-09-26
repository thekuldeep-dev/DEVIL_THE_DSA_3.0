import java.util.*;
public class largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } else if (b >= c) {
            System.out.println("Largest = " + b);
        }else{
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
}
