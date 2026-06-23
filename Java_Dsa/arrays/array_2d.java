import java.util.*;
public class array_2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[][];

        // arr = new int[7][8];

        // int brr [][] = {
        //                     {1,2,3},
        //                     {4,5,6},
        //                     {7,8,9}
        // };
        // int row_length = brr.length;
        // int col_length = brr[0].length;
        // //System.out.println(brr[0][2]);    
        
        
        // // printing whole array by for lop but this method works when all no. of columns elments are same...

        // for(int rowIndex = 0; rowIndex <= row_length-1; rowIndex++){
        //     for(int colIndex = 0; colIndex <= col_length-1; colIndex++){
        //         System.out.print(brr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }




        // now printing array when no of columns elements are differ


        // int brr [][] = {
        //                 {1,2},
        //                 {3,4,5,6},
        //                 {7},
        //                 {8,9,10,8,9,1,2,3,4,5}
        // };

        // int row_length = brr.length;
        
        // for(int rowIndex = 0; rowIndex <= row_length-1; rowIndex++){

        //     // jab bhi mai new row mai enter karunga
        //     // same point pe mai col length calculate karunga
        //     // current row -> brr[rowIndex]

        //     int col_length = brr[rowIndex].length;
        //     for(int colIndex = 0; colIndex <= col_length-1; colIndex++){
        //         System.out.print(brr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }
        





        // input in 2d array


        int arr [][];
        arr = new int[2][3];
        int row_length = arr.length;
        int col_length = arr[0].length;
        int sum = 0;

        for(int rowIndex = 0; rowIndex<= row_length-1;rowIndex++){
            for(int colIndex = 0; colIndex<= col_length-1; colIndex++){
                arr[rowIndex][colIndex] = sc.nextInt();
            }
        }


        // printing value
        for(int rowIndex = 0; rowIndex<= row_length-1;rowIndex++){
            for(int colIndex = 0; colIndex<= col_length-1; colIndex++){
                System.out.print(arr[rowIndex][colIndex]+ " ");
            }
            System.out.println();
        }

        // sum of these elemetns

        for(int rowIndex = 0; rowIndex<= row_length-1;rowIndex++){
            for(int colIndex = 0; colIndex<= col_length-1; colIndex++){
                sum = sum + arr[rowIndex][colIndex];
            }
        }
        System.out.println("Sum of elements : " + sum);


        // findig max values 

        int max_value = arr[0][0];

        for(int rowIndex = 1; rowIndex<=row_length-1; rowIndex++){
            for(int colIndex = 1; colIndex<=col_length-1; colIndex++){
                if (arr[rowIndex][colIndex]>=max_value) {
                    max_value = arr[rowIndex][colIndex];
                }
            }
        }
        System.out.println("maximum value element : " + max_value);
    }
}