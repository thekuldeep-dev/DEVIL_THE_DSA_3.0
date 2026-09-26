public class prime_number {

    // for only n>=2 
    public static boolean isPrime(int n){
        //corner cases:
        if (n==2) {
            return true;
        }
        

        //boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if (n%i == 0) {
                //isPrime = false;
                return false;
            }
        }
        
        //return isPrime;
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(19));
    }
}
