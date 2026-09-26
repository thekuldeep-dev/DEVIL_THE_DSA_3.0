//import java.util.*;
public class Type_Promotion{
    public static void main(String args[]){
        // Rule 1:
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);   // so in this all char operands type promote into int
        
        //rule 2: all convert into largest possible datatype.
    }
}