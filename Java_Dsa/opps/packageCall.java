package opps;

import opps.polymorphism.calculator;


public class packageCall {
    public static void main(String[] args) {
        calculator cal = new calculator();

        System.out.println(cal.Add(4, 9));
    }
}
