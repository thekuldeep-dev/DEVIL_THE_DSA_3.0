   //printing reverse
// import java.util.*;
// public class reverse_ofNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int num = sc.nextInt();
        
//         while(num>0){
//             int last_digit = num%10;
//             System.out.print(last_digit);
//             num = num/10;
//         }
//        sc.close();
//     }
// }


//Reverse the given no

import java.util.*;
public class reverse_ofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt(), sum=0;
        
        while(num>0){
            int last_digit = num%10;
            sum = (sum*10)+last_digit;  //imp logic
            num = num/10;
        }
        System.out.println("Reverse of digit:"+sum);
       sc.close();
    }
}