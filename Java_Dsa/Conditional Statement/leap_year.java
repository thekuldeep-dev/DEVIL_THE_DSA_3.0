import java.util.*;
public class leap_year {
    public static void main(String[] args) {

        //✅ Correct Logic

        // A leap year is:

        // ✔ Divisible by 400
        // OR
        // ✔ Divisible by 4 AND NOT divisible by 100
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
