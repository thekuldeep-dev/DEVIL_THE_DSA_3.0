#include<iostream>
using namespace std;

int main(){
    // Binary to Decimal
    // int num, ans = 0, lastTerm, pow = 1, remTerm;
    // cout<<"Enter the number: ";
    // cin>>num;
    // for (num; num > 0; num = remTerm)
    // {
    //     lastTerm = num % 10;
    //     ans = lastTerm * pow + ans;
    //     remTerm = num / 10;
    //     pow *= 2;

    // }
    // cout<<ans;
    // return 0;







    // BY While loop

    int num, ans = 0, rem, pow = 1;
    cout<<"Entrer the num: ";
    cin>>num;

    while (num > 0)
    {
        // remainder
        rem = num%10;
        // Num ko divide kardo
        num = num/10;
        // Ans
        ans = pow * rem + ans;
        pow*=2;

    }
    cout<<ans<<endl;
}