#include<iostream>
using namespace std;

int main(){
    int num, ans = 0, rem, rem2, ans2 = 0, quot, pow = 1, pow2 = 1;
    cout<<"Enter the Number: ";
    cin>>num;
    for (num; num > 0; num = quot)
    {
        // remainder
        rem = num % 10;
        // Quotient
        quot = num / 10;
        // ans
        ans = ans + rem * pow;
        pow*= 2;

    }

    for (ans ; ans >0; ans = ans / 8)
    {
        rem2 = ans % 8;
        ans2 = ans2 + rem2 * pow2;
        pow2*= 10;
    }
    
    cout<<ans2;
    
    

    // Imp. Note for converting Binary to Hexadecimal we study in future, because our current knowledge can't sufficient to store no. and alpahbet(characters) togther so we study in string.
}