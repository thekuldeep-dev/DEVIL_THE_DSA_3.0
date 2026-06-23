import java.util.*;
public class array {
    public static void main(String[] args) {
        // int arr [];
        // arr = new int[4];
        // int brr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        // System.out.println(brr[3]);

        // int n = brr.length;
        // by loop
        // for(int index=0; index<=n-1; index++){
        //     System.out.println(brr[index]);
        // }


        // another way by loop(for each loop)
        // for(int val : brr){
        //     System.out.println(val);
        // }


        // input/inseting method by scanner in arr by loop

        // for(int index = 0; index<n-1; index++){
        //     arr[index]=sc.nextInt();
        // }



        // int arr[];
        // arr = new int[7];

        // int brr[] = {1,2,3,4,5};
        // int n = brr.length;

        // printing values by for loop

        // for(int index = 0; index <= n-1; index++){
        //     System.out.println(brr[index]);
        // }


        // by for each loop

        // for(int val : brr){
        //     System.out.println(val);
        // }






        // q1:  sum of data that store in array

        //     int sum = 0;

        //     for(int index = 0;index<= n-1; index++){
        //         sum = sum + brr[index];
        //     }
        //     System.out.println("Sum of array data: " + sum);



        // Q2:  multiplication of array data

        // int multi = 1;

        // for(int index = 0; index <= n-1; index++){
        //     multi = multi* brr[index];
        // }
        // System.out.println("Multiplication: " + multi);




        // Q3:  finding the maximum element in array;
        
        
        //     int arr[] = {-12,8,9,10,17};
        //     int n = arr.length;
        //     int maximum = arr[0];

        //     for(int index = 1; index <= n-1; index++){
        //         if (arr[index]>=maximum) {
        //             maximum = arr[index];
        //         }
        //     }
        //     System.out.println(maximum);







        // Q4:  finding the minimum element from the array


        int arr[] = {1,89,-789,-999,1001,-299, -999};

        int n = arr.length;
        int min_result = arr[0];

        for(int index = 1; index <= n - 1; index++){
            if (min_result>=arr[index]) {
                min_result = arr[index];
            }
        }
        System.out.println(min_result);
    }
}
