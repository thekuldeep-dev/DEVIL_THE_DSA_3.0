import java.util.*;
public class Sumof_EorO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int sum_odd=0, sum_even =0;
        do {
            number = sc.nextInt();
            if (number%2==0) {
                sum_even += number;
            }else{
                sum_odd += number;
            }
            System.out.println("Do you want to continue? if yes select choice 1 or for not choose 0");
            choice = sc.nextInt();
        } while (choice==1);

        System.out.println("Sum of even_Numbers = "+ sum_even);
        System.out.println("Sum of odd_Numbers = "+ sum_odd);
        sc.close();
    }
}
