import java.util.*;
public class character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = 'A';
        //outer loop for row
        for(int i=0; i<num; i++){
            //inner loop for print
            for(int j=0; j<i+1; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
