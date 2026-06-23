import java.util.*;
public class parameter_function {

    //functions are also consume memory as call stack.

    public static int Sum(int num1, int num2){  //num1 and num2 are paramters or formal paramters
        int Sum = num1+num2;
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int sum = a+b;
        //System.out.println("Sum : " + sum);
        int sum = Sum(a,b); // a and b are arguments or actaul paramters
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}    
