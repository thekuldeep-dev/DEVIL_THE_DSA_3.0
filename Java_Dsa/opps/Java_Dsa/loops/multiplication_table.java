import java.util.*;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Table of "+ n);
        for(int i=1; i<=10; i++){
        //    int t = n*i;
        //    System.out.println(n +"*" + i + "=" + t);

        //without variable
        System.out.println(n +"*" + i + "=" + (n*i));
        }
        sc.close();
    }
}
