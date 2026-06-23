import java.util.*;
public class star_triangle {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
