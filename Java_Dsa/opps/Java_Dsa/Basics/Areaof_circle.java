import java.util.*;
public class Areaof_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r, area;
        r = sc.nextFloat();
        area = 3.14f * r *r;
        System.err.println("Area of circle whose radius: " + r + "\n" + "Area: " + area);
        
        sc.close();
    }
}
