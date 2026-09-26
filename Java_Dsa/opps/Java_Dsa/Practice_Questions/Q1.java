import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Type Promotion concept
        int A = sc.nextInt();
        int B = sc.nextInt();
        float C = sc.nextInt();

        float average = (A + B + C) / 3;
        System.out.println(average);

        sc.close();
    }
}