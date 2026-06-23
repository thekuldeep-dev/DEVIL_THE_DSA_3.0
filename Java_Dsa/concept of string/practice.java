public class practice{ 
    public static void main(String[] args) {
        
        // print each character of string

        String name = "Kuldeep";
        int n = name.length();

        for(int index = 0; index<=n-1; index++){
            System.out.println(name.charAt(index));
        }


        //counting of length without length function
        
        // we use for each loop but we see after try its not working on string..
        // int count = 0;
        // for(char chr : name){
        //     count++;
        // }


        // so we use another way

        char arr [] = name.toCharArray();
        int len = arr.length;
        System.out.println(len);



        // next q. is count vowel

        String word = "HELLO WELCOME IN DeViL Universe";

        int count =0;
        for(int index = 0; index<=word.length()-1;index++){
            char ch = word.charAt(index);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
            ) {
                count++;
            }
        } 
        System.out.println(count);




        // reverse string question

        String K = "Gautam";
        int length = K.length();
        String rev_String = "";
        for(int index = length-1; index>=0; index--){
            rev_String = rev_String + K.charAt(index);
        }
        System.out.println(rev_String);




        // check  string is palidrome or not


        String pal = "mom";
        int plength = pal.length();
        String str = "";
        boolean ispalidrome = true;

        for(int index = plength-1; index>=0;index--){
            str = str + pal.charAt(index);
        }

        if (pal.equals(str)) {
            ispalidrome = true;
        }

        else{
            ispalidrome = false;
        }

        System.out.println(ispalidrome);
    }
}        
    

