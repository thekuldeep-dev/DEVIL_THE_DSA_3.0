import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("ENter value of b");
        int b = sc.nextInt();

        int addition = a+b;
        System.out.println("addition of a and b: "+addition);

        int substraction = a-b;
        System.out.println("substraction of a and b: "+substraction);

        int mutiply = a*b;
        System.out.println("mutiply of a and b: "+mutiply);

        int divide = a/b;
        System.out.println("divide of a and b: "+divide);

        int modulas = a%b;
        System.out.println("modulas of a and b: "+modulas);

        sc.close();
    }
}
