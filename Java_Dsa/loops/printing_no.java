import java.util.*;
public class printing_no{
    public static void main(String[] args) {
        // int i = 1;
        // while (i<=10) {
        //     System.out.print(i + " ");
        //     i++;
        // }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = sc.nextInt();
        int i = 1;
        while (i<=num) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}