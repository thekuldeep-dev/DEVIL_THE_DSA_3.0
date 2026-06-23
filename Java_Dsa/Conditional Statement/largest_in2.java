import java.util.*;
public class largest_in2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("a = " + a + " Is lagest no.");
        }
        else{
            System.out.println("b = " + b + " Is lagest no.");
        }

        sc.close();
    }
}