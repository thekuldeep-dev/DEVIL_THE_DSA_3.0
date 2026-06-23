import java.util.Scanner;

public class common_Methods {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        String str = "Kuldeep";
        String str2 = "KulDeep";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));


        // empty -> length = 0
        // blank -> empty or sirf spaces 

        String e = "  ";
        System.out.println(e.isEmpty());
        System.out.println(e.isBlank());

        // trim removes spaces from begining and ending
        String k = "   KG   ";
        System.out.println(k.length());
        // k.trim();  // its wrong way because .trim return value so we need to store
        String s = k.trim();
        System.out.println(s.length());



        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        String kg = "I'm Kuldeep Gautam, a BTech CSE Student.";
        // substring 
        System.out.println(kg.substring(4,10));


        // contains check that words present in string or not
        System.out.println(kg.contains("Kuldeep"));


        // valueOf used to convert ant type data into string..  

        int num = 47859;
        String str_num = String.valueOf(num);
        System.out.println(str_num+1);  // so its string if not string its caluclate with 1
        // but it only canctenation only print 478591...


        // startWith() checks its start with... or vice versa for endWith()
        
        

        // toChararray() convert into char array.

        String dev = "Dev Gautam" ;
        char[] arr = dev.toCharArray();
        // print the char array

        for(char ch:arr){
            System.out.println(ch);
        }



        // split()  is used break on the basis on specific condtion or criteria via regual expression


        String input = "My,name,is,Kuldeep,Gautam";
        String[] words = input.split(",");
        for(String ch : words){
            System.out.println(ch);
        }


<<<<<<< HEAD
=======

        // replace is used to replace and its return string so its need a varaible to store that string
        
        String name = "Kuldeep";
        name = name.replace('K', 'S');
        System.out.println(name);


        

        


>>>>>>> 59e6357 (Latest Java updates)
     }
}
