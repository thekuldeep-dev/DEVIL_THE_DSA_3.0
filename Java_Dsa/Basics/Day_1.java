// public class Day_1{
//     public static void main(String args[]){
//         System.out.print("1 2 3 4 5 6 7");
//     }
// }



// prime no.

// public class Day_1{
//     public static void main(String args[]){
//         int num = 17;
//         boolean isPrime=  true;
//         for(int i = 2; i<num; i++){
//             if(num%i==0){
//                 isPrime = false;
//                 break;
//             }
//             else{
//                 isPrime = true;
//             }
//         }
//         if(isPrime == true){
//             System.out.println("No. is prime");
//         }
//         else{System.out.println("No. is non prime");}
//     }
// }


// simple pattern

// public class Day_1 {

//     public static void main(String[] args) {
//         int num = 3;
//         for(int i = num; i>0;i--){
//                 for(int k = i; k>0;k--){
//                 System.out.print("*");
//                 }
//             System.out.print("\n");
//         }
//     }
// }




// input from user

// import java.util.*;

// public class Day_1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }




// while loop use case

// import java.util.*;

// public class Day_1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         int i = 0;
//         while (count>i) {
//             System.out.println("Hello");
//             i++;
//         }
//     }
// }



// sum 1 to n

// import java.util.*;

// public class Day_1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         int i = 0, sum = 0;
//         while (count>=i) {
//             sum = sum+i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }





// print reverse of a number

// import java.util.*;

// public class Day_1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         int div, rem, revS=0;
//         while(num>0){
//             rem = num%10;
//             System.out.print(rem);
//             num = num/10;
            
//                }
//     }
// }




// reverse of a number 

// import java.util.*;

// public class Day_1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         int div, rem, revS=0;
//         while(num>0){
//             rem = num%10;
//             num = num/10;
//             revS = (revS*10)+rem;
//             }
//         System.out.println(revS);    
//     }
// }



// print half pyramid pattern
/*
    1
    1 2
    1 2 3
    1 2 3 4
*/


import java.util.*;

public class Day_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 1; i <= count; i++){
            for(int k = 1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}