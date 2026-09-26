#include<iostream>
using namespace std;

int main(){
    // Decimal to Binary conversion
    // My code
    // int num, ans = 0, base, rem, pow = 1;
    // cout<<"Enter the number: ";
    // cin>>num;
    // int i = num;
    // cout<<"Enter the Base in whcih you want to convert: ";
    // cin>>base;

    // for (i; i > 0; i = i / base)
    // {
    //     rem = i % base;
    //     ans = ans + rem * pow;
    //     pow = pow *10;
    // }
    // cout<<ans;


    


    // Optimise sir solution(by while loop)

    int num, rem, ans = 0, base, pow = 1;
    cout<<"Enter the number: ";
    cin>>num;
    cout<<"Enter the Base in whcih you want to convert: ";
    cin>>base;


    while (num > 0)
    {
        // remainder
        rem = num % base; 
        // rem by bitwise operator   rem = num&1 for only 2 base;
        // Quotient
        num /=base;  // by right shift operator.
        // ans
        ans +=rem * pow;
        pow *=10;
    }
    
    cout<<ans;
    return 0;
}