import java.util.*;
public class Square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
