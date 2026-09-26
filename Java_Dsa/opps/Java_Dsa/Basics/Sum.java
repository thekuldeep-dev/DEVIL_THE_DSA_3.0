import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, sum, product;
        
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();

        sum = a + b;
        System.err.println("Sum of a + b: " + sum);

        product = a*b;
        System.out.println("Product of a * b: " + product);

        sc.close();
    }
}

