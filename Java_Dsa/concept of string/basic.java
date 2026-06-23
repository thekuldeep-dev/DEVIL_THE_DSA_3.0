import java.util.Scanner;

public class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char ch = 'a';
        // char used for single character


        // but string is a sequence of character
        // its support multiple character  -> eg.  "kuldeep"


        // string creation by string literal
        // String str = "Kuldeep";   // string is non primitvie datatype

        // // string creation by new keyword 
        // String k = new String("Gautam");

        // // System.out.println(str + " " + k);
        // // // System.out.println(k[0]);  // its wrong way, its correct for only array

        // // System.out.println(k.length());
        // // System.out.println(k.charAt(3));

        // int n = k.length();


        // // printing of string by loop

        // for(int index = 0; index <= n-1; index++){
        //     System.out.print(k.charAt(index) + " ");
        // }




        // strings are immutable means changes not possible in orginial string.






        // string comparrison
        // 3 methods:    
                    // 1. ==
                    // 2. .equal()
                    // 3. .equalsIgnore()


        
                    
        // String name1 = "Kuldeep";
        // String name2 = "Kuldeep";
        // String name3 = "kuldeep";

        // if (name1==name2) {
        //     System.out.println("Both string are equal");
        // }
        // else{
        //     System.out.println("both strings are not equal");
        // }
        // // so important thing is they dont compare content or value sotred in name1 or name2 reference
        // // they just compare is they both refer to same string that stored in string pool.

        // // so just check same refercen or address or not.


        // //  by equal() : its actually compare content of both strings not reference or address
        // // its is case sensitive.



        // if (name1.equals(name2)) {
        //     System.out.println("Both string are equal");
        // }
        // else{
        //     System.out.println("both strings are not equal");
        // }




        // if (name1.equalsIgnoreCase(name3)) {
        //     System.out.println("Both string are equal");
        // }
        // else{
        //     System.out.println("both strings are not equal");
        // }



        System.out.println("Enter String content");
        String str = sc.nextLine();
        System.out.println("value : " + str);

        // but if use next() instead of nextLine(), its stops take input after space.


        
    }
}