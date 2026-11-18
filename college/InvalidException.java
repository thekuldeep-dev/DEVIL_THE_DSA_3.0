// public class exam_practice{
//     static void CheckAge(int age) throws Exception{
//         if (age<18) {
//             throw new Exception("You are not eligible for voting!");
//         }
//         System.out.println("You are elgible.");
//     }

//     public static void main(String args[]){
//         try{
//             CheckAge(15);
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("Voting Eligibility check complete.");
//         }
//     }
// }


// public class exam_practice {

//     public static void main(String[] args) {
//         try {
//             int a = 8;
//             int b = 0;
//             int result = a/b;
//             System.out.println("Result: "+result);
//         } catch (ArithmeticException e) {
//             System.out.println("cannot divide by zero");
//         }
//         finally{
//             System.out.println("Program contnuis");
//         }
//     }
// }


//  class InvalidAgeException extends Exception{
//     InvalidAgeException(String message){
//         super(message);
//     }
// }

// public class InvalidException{
//     static void checkAge(int age) throws InvalidAgeException{
//         if (age<18) {
//             throw new InvalidAgeException("You are not eligible for vote!");
//         }
//         System.out.println("you are eligible");
//     }

//     public static void main(String[] args) {
//         try {
//             checkAge(15);
//         } catch (InvalidAgeException e) {
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("Eligibilty check completes.");
//         }
//     }
// }


