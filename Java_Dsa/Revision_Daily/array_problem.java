// import java.util.*;
// public class array_problem {
//     public static void main(String[] args) {
//         // Problem 1: Find the sum of all elements
//         Scanner sc = new Scanner(System.in);
//         int arr [] = new int[6];
//         int sum = 0;
//         // taking input
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter value at index "+i+": ");
//             arr[i] = sc.nextInt();
//         }
//         // printing values and sum
//         for(int num:arr){
//             System.out.println(num);
//             sum += num;
//         }
//         System.out.println("sum of elements: "+ sum);
//         sc.close();
//     }
// }





// Problem 2: Find the largest element (2 methods this is optimal)
// another method with sort the array by arr.sort() but its not optimal so we use this
// import java.util.*;
// public class array_problem {
//     public static void main(String[] args) {
//         // Problem 1: Find the sum of all elements
//         Scanner sc = new Scanner(System.in);
//         int arr [] = new int[6];
//         int largest_no = arr[0];
//         // taking input
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter value at index "+i+": ");
//             arr[i] = sc.nextInt();
//         }
//         for(int num:arr){
//             if (num>largest_no) {
//                 largest_no = num;
//             }
//         }
//        System.out.println("largest no. : "+largest_no);
//         sc.close();
//     }
// }




// problem 4: Reverse the array
// these normal approach also another rev named array is also noraml approach
// import java.util.*;
// public class array_problem {
//     public static void main(String[] args) {
//         // Problem 1: Find the sum of all elements
//         Scanner sc = new Scanner(System.in);
//         int arr [] = new int[6];
//         int len = arr.length;
        
//         // taking input
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter value at index "+i+": ");
//             arr[i] = sc.nextInt();
//         }
//         for(int i = len-1; i>=0; i--){
//             System.out.println(arr[i]);
//         }
//            sc.close();
//     }
// }


// another optimise approach of two pointers

// import java.util.*;
// public class array_problem {
//     public static void main(String[] args) {
//         // Problem 1: Find the sum of all elements
//         Scanner sc = new Scanner(System.in);
//         int arr [] = new int[6];
//         int left = 0;
//         int right = arr.length-1;
        
//         // taking input
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter value at index "+i+": ");
//             arr[i] = sc.nextInt();
//         }
//         while (right>left) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }

//         System.out.println(Arrays.toString(arr));
//            sc.close();
//     }
// }





// problem 5: Searching for an element 

// by linear serach
// import java.util.*;
// public class array_problem {
//     public static void main(String[] args) {
//         // Problem 1: Find the sum of all elements
//         Scanner sc = new Scanner(System.in);
//         int arr [] = new int[6];
//         int index = -1; // for not found its writes -1
//         System.out.println("Enter what you want to serach: ");
//         int target = sc.nextInt();
        
//         // taking input
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter value at index "+i+": ");
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i<arr.length;i++){
//             if (target==arr[i]) {
//                 index = i;
//                 break;
//             }
//         }
//         System.out.println("found at index: "+ index);
//         sc.close();
//     }
// }




// approach 2: Binary search
import java.util.*;
public class array_problem {
    public static void main(String[] args) {
        // Problem 1: Find the sum of all elements
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[6];
        // taking input
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter value at index "+i+": ");
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        System.out.print("Enter what you want to serach: ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        while (left<=right) {
            int mid = left + (right-left)/2;
            
            if (arr[mid] == target) {
                System.out.println("found at index:"+mid);
                break;
            }
            else if(arr[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        sc.close();
    }
}
