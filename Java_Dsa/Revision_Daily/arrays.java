// Revision from basic to advance

import java.util.*;
public class arrays {

    public static void main(String[] args) {
        // this is creation of array way by direct
        // int [] arr = {45,19,7,18};

        // another way of creation by fixed size
        // int [] kuldeep = new int[5];
        // kuldeep[0] = 19;
        // System.out.println(kuldeep[0]);
        // System.out.println(kuldeep);


        // // another way is direct input from user(we also use arr.length)
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the value at index "+i+": ");
            arr[i] = sc.nextLine();
        }
        // for(int i = 0; i < 5; i++){
        //     System.out.println("The value at index "+i+": ");
        //     System.out.println(arr[i]);
        // }

        // A special method for loop enhancing(for each loop)
        for(String num:arr){
            System.out.println(num);
        }
        sc.close();
    }
}