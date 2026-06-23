package Java_Dsa.Practice_Questions;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the price of pencil:");
        float pencil = sc.nextFloat();
        pencil += pencil*0.18;

        System.out.println("Enter the price of pen:");
        float pen = sc.nextFloat();
        pen += pen*0.18;

        System.out.println("Enter the price of Eraser:");
        float Eraser = sc.nextFloat();
        Eraser += Eraser*0.18;

        float Total_Cost = pencil + pen + Eraser;
        System.out.println("Total cost:" + Total_Cost);

        sc.close();
    }
}
