public class function_overloading {

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        int a = 4, b = 5, c = 8;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
    }
}
