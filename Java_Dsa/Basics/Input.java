import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();  // its only input before space (eg. dev g, so only dev print)
        // System.out.println(input);

        // for whole line, we use nextLine function
        // String name = sc.nextLine();
        // System.out.println(name);


        //for integer input
        int number = sc.nextInt();
        System.out.println(number);

        float number_1 = sc.nextFloat();
        System.out.println(number_1);

        double number2 = sc.nextDouble();
        System.out.println(number2);

        sc.close();
    }
}
