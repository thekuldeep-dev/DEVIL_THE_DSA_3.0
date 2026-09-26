import java.util.*;
public class full_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            //space
            for(int j=0; j<num-i-1; j++){
                System.out.print(" " + " ");
            }
            //star
            for(int j=0; j<i+1; j++){
                System.out.print("*" + " ");
            }
            //part 2 star
            for(int j=0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
