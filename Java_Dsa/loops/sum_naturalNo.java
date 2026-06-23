import java.util.*;
public class sum_naturalNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i = 1, sum = 0;
        
        while (i<=count) {
            sum = sum + i;
            i++;
        }

        System.out.println("sum = " + sum);
        sc.close();
    }
}
