import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fact = 1;
        if (n == 1 || n ==0) {
                System.out.println("factorail: 1");
                sc.close();
                return;
        }
        else{
            for(int i=n; i>1; i--){
                fact *= i;
            }
        }
        System.out.println("factorail: " + fact);
        sc.close();
    }
}
