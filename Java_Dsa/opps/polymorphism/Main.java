
package opps.polymorphism;

public class Main {
    public static void main(String[] args) {

        // calculator cal = new calculator();

        // System.out.println(cal.Add(12, 6));
        // System.out.println(cal.Add(4, 5.0f));
        // System.out.println(cal.Add(3, 5, 99));

        //overriding
        circle c = new circle();
        // c.draw(); 

        // rectangle rc = new rectangle();
        // rc.draw();

    //    doDrawingStuff(new shape());
        doDrawingStuff(c);
    }
    public static void  doDrawingStuff(shape s){
            s.draw();
    }
}
