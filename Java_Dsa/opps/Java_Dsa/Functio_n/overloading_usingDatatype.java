public class overloading_usingDatatype {

    // overloading only depend upond no. of paramter and type of paramter.
    // not depend on datatype of function.

    public static int sum_intType(int num1, int num2){
        return num1+num2;
    }

    public static float sum_floatType(float num1, float num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        int a = 45, b = 96;
        float c = 45.02f , d = 96.024f;
        System.out.println(sum_intType(a, b));
        System.out.println(sum_floatType(c,d));
    }
}
