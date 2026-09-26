import java.util.*;
public class factorail_method {

    int print_factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }
        else{
            return n*print_factorial(n-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int num = sc.nextInt();

        factorail_method obj = new factorail_method();
        int fact = obj.print_factorial(num);
        System.out.println("factorail : "+fact);

        sc.close();
    }
}
