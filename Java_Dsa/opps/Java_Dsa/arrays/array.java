// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         // int arr [];
//         // arr = new int[4];
//         // int brr[] = {1,2,3,4,5};
//         Scanner sc = new Scanner(System.in);
//         // System.out.println(brr[3]);

//         // int n = brr.length;
//         // by loop
//         // for(int index=0; index<=n-1; index++){
//         //     System.out.println(brr[index]);
//         // }


//         // another way by loop(for each loop)
//         // for(int val : brr){
//         //     System.out.println(val);
//         // }


//         // input/inseting method by scanner in arr by loop

//         // for(int index = 0; index<n-1; index++){
//         //     arr[index]=sc.nextInt();
//         // }



//         // int arr[];
//         // arr = new int[7];

//         // int brr[] = {1,2,3,4,5};
//         // int n = brr.length;

//         // printing values by for loop

//         // for(int index = 0; index <= n-1; index++){
//         //     System.out.println(brr[index]);
//         // }


//         // by for each loop

//         // for(int val : brr){
//         //     System.out.println(val);
//         // }






//         // q1:  sum of data that store in array

//         //     int sum = 0;

//         //     for(int index = 0;index<= n-1; index++){
//         //         sum = sum + brr[index];
//         //     }
//         //     System.out.println("Sum of array data: " + sum);



//         // Q2:  multiplication of array data

//         // int multi = 1;

//         // for(int index = 0; index <= n-1; index++){
//         //     multi = multi* brr[index];
//         // }
//         // System.out.println("Multiplication: " + multi);




//         // Q3:  finding the maximum element in array;
        
        
//         //     int arr[] = {-12,8,9,10,17};
//         //     int n = arr.length;
//         //     int maximum = arr[0];

//         //     for(int index = 1; index <= n-1; index++){
//         //         if (arr[index]>=maximum) {
//         //             maximum = arr[index];
//         //         }
//         //     }
//         //     System.out.println(maximum);







//         // Q4:  finding the minimum element from the array


//         int arr[] = {1,89,-789,-999,1001,-299, -999};

//         int n = arr.length;
//         int min_result = arr[0];

//         for(int index = 1; index <= n - 1; index++){
//             if (min_result>=arr[index]) {
//                 min_result = arr[index];
//             }
//         }
//         System.out.println(min_result);
//         sc.close();
//     }
// }




import java.util.*;
public class array{
    public static void main(String[] args) {
        // System.out.println("hello");

        // // declaration
        // int arr[];
        // // alocation
        // arr = new int[4];
        // int brr [] = {42,15,89,37};

        // System.out.println("value at index 3: "+ brr[3]);
        // System.out.println("value at index 0: "+ brr[0]);


        // // by for loop
        // int n = brr.length;
        // for(int index = 0; index<n; index++){
        //     System.out.println("value at index "+index+": "+brr[index]);
        // }

        // // by for each loop(simplest way)

        // for(int var : brr){
        //     System.out.println(var);
        // }


        // //taking inputs
        Scanner sc = new Scanner(System.in);
        // for(int index = 0; index <4; index++){
        //     arr[index] = sc.nextInt();
        // }

        //verify input
        // for(int var : arr){
        //     System.out.println(var);
        // }


        //printing sum of array

        // int a [] = {14,15,16,58};
        // int length = a.length, sum = 0;

        //by for loop
        // for(int index = 0; index<length; index++){
        //     sum = sum + a[index];
        // }
        // System.out.println("Sum of array: " + sum);


        // by for each loop

        // for(int var:a){
        //     sum = sum + var;
        // }
        // System.out.println("Sum of array: " + sum);


        // finding maximum element in array

        // int elm [] = {12,800,45,96,960,44,1008,4};
        // int maxElement = elm[0];

        // // by for each loop

        // for(int var:elm){
        //     if(var>=maxElement){
        //         maxElement = var;
        //     }
        // }
        // System.out.println("maximum element in array: " + maxElement);




        // 2-D arrays

        //declare
        int [][] arr;

        //allocation
        arr = new int [3][4];
        //init
        int brr [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };


        //priting of elemets by loop(nested)
        int rowLength = brr.length;
        int colLength = brr[0].length; // its work only when same amount of element in array rows

        for(int row = 0; row<rowLength;row++){
            for(int col = 0; col<colLength; col++){
                System.out.println(brr[row][col]);
            }
        }


        // input in 2-D arrays

        int kG[][];
        kG = new int[4][2];

        for(int rowIndex = 0; rowIndex < kG.length; rowIndex++){
            for(int colIndex = 0; colIndex < kG[rowIndex].length; colIndex++){
                System.out.println("enter the value of row: "+rowIndex+" and col: "+colIndex);
                kG[rowIndex][colIndex] = sc.nextInt();
            }
        }

        for(int rowIndex = 0; rowIndex < kG.length; rowIndex++){
            for(int colIndex = 0; colIndex < kG[rowIndex].length; colIndex++){
                System.out.print(" "+kG[rowIndex][colIndex]);
            }
            System.out.println();
        }

        // sum of array

        int sum = 0;
        for(int rowIndex = 0; rowIndex < kG.length; rowIndex++){
            for(int colIndex = 0; colIndex < kG[rowIndex].length; colIndex++){
                sum = sum + kG[rowIndex][colIndex];
            }
        }
        System.out.println("sum: "+sum);

        // similary for multiply



        // max value
        int maxValue = kG[0][0];

        for(int rowIndex = 0; rowIndex < kG.length; rowIndex++){
            for(int colIndex = 0; colIndex < kG[rowIndex].length; colIndex++){
                if (maxValue<kG[rowIndex][colIndex]) {
                    maxValue = kG[rowIndex][colIndex];
                }
            }
        }
        System.out.println("maxValue: " + maxValue);
        sc.close();
    }            
}