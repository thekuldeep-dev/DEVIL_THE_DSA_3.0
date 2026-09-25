// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int lenth = sc.nextInt();
//         int breadth = sc.nextInt();

//         for(int row = 1; row<=lenth; row++){
//             for(int col = 1; col<= breadth; col++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// square star pattern 
// import java.util.*;
// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i = 0; i<num; i++){
//             for(int k = 0; k<num;k++){
//                 System.err.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// new pattern
/* *
   * *
   * * *
   * * * *
*/
// import java.util.*;
// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for( int row=0; row<num;row++){
//             for(int col = 0; col<=row; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }







// rhombus patter
/*      * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
*/


// import java.util.*;
// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for( int row=0; row<num;row++){
//             // for space priting
//             for(int space = 0; space<num-row-1; space++){
//                 System.out.print("  ");
//             }
//             // for star priting 
//             for(int star1 = 0; star1<=row; star1++){
//                 System.out.print("* ");
//             }

//             // second part of star
//             for(int star2=0; star2< num-row-1; star2++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }




// another pattern

//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1


// import java.util.*;
// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of num : ");
//         int num = sc.nextInt();

//         for( int row=0; row<num;row++){
//             // for space priting
//             for(int space = 0; space<num-row-1; space++){
//                 System.out.print("  ");
//             }
//             // for star priting 
//             for(int star1 = 0; star1<=row; star1++){
//                 System.out.print(star1+1 + " ");
//             }

//             // second part of star
//             for(int star2=0; star2< row; star2++){
//                 System.out.print(row-star2 + " ");
//             }
//             System.out.println();
//         }
//     }
// }






// another pattern number pyramid
//       1
//     2 2 2
//   3 3 3 3 3
// 4 4 4 4 4 4 4



// import java.util.*;
// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of num : ");
//         int num = sc.nextInt();

//         for( int row=0; row<num;row++){
//             // for space priting
//             for(int space = 0; space<num-row-1; space++){
//                 System.out.print("  ");
//             }
//             // for star priting 
//             for(int star1 = 0; star1<=row; star1++){
//                 System.out.print(row+1 + " ");
//             }

//             // second part of star
//             for(int star2=0; star2< row; star2++){
//                 System.out.print(row+1 + " ");
//             }    
//             System.out.println();
//         }
//     }
// }
      




// another pattern 

//  * * * * *
//  * * * *
//  * * *
//  * * 
//  * 




// import java.util.*;

// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of num : ");
//         int num = sc.nextInt();
//         for(int row = 0; row < num; row++){
//             for(int col = 0; col< num-row; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }







// another pattern inverse pyramid


// * * * * * * *
//   * * * * *
//     * * *
//       *





// import java.util.*;

// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of num : ");
//         int num = sc.nextInt();

//         for(int row=0; row<num; row++){
//             // space
//             for(int spc= 0; spc<row; spc++){
//                 System.out.print("  ");
//             }
            
//             for(int str1 = 0; str1<num-row; str1++){
//                 System.out.print("* ");
//             }

//             for(int str2 = 0; str2<num-row-1; str2++){
//                 System.out.print("* ");
//             }
//             System.out.println();  
//         }
//     }
// }






// advance patter
// * * * * * *
// *         *
// *         *
// * * * * * *





import java.util.*;

public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        int num = sc.nextInt();

        for(int row=1; row<=num; row++){
            // for each row six column
            for(int  col = 1; col<=6; col++){
                if (row==1 || row==num) {
                    System.out.print("* ");
                }
                else{
                    // middle rows
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();  
        }

        sc.close();
    }
}