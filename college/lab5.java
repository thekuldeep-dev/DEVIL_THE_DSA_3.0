.

import java.util.Scanner;

public class lab5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the array index");
        int index = sc.nextInt();
        int[] arr = {1,2,0};


       try{
           
           System.out.println();
           int c = a/b; // Arithmetic exception occurred IF b = 0;

           System.out.println(c);
           System.out.println(arr[index]); // Array index out of bound occurred if index > size -1 of array length

       }
       catch(ArithmeticException e){
           System.out.println("Arithmetic exception occured");
           System.out.println(e);
       }
       catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");
        }
       catch (ArrayStoreException e) {
           System.out.println("No same value stored");
       }
       catch (Exception e){
           System.out.println("Other exceptions");
       }

       finally {
           System.out.println("This  must be print");
       }

    }
}