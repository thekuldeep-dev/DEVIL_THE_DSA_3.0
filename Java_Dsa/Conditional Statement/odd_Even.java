import java.util.*;
public class odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no. =");
        int number = sc.nextInt();

        if (number%2 == 0) {
            System.out.println("number = " + number + " is even.");
        } else{
            System.out.println("number = " + number + " is odd.");
        }

        sc.close();
    }
}
