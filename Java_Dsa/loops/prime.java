// import java.util.*;
// public class prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no.");
//         int n = sc.nextInt();
//         //A prime no. must required two factors
//         // 0 is not prime, its have infinitely many factors
//         // 1 has only one facotr so its also not prime
//         boolean isPrime = true;
//         if (n<2){
//             isPrime = false;
//         }
//         for (int i=2; i<=n-1; i++) {
//             if (n%i==0) {
//                 isPrime = false;
//                 break;
//             }
//             //isPrime = true;
//         }
//         // System.out.println(isPrime);

//         if (isPrime==true) {
//             System.out.println(n + " is prime");
//         }else{
//             System.out.println(n + " is not prime");
//         }
//         sc.close();
//     }
// }


// efficinet code
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        }else{
            // n = sqrt(n)*sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
    
        }
        if (isPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        sc.close();
    }
}

