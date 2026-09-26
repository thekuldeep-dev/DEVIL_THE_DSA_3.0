#include<iostream>
using namespace std;

void changeA(int a){
    a = 20;
    cout<<a<<endl;  // prints 20 because inside this function, a new local copy of the variable 'a' is created and modified
}

int main(){
    int a = 10;
    changeA(a);  // prints 20 (function changes only its local copy, not the original 'a')
    cout<<a<<endl;  // prints 10 (original 'a' remains unchanged)

    // 🔍 Improved Explanation:
    // This example demonstrates **Pass by Value** in C++.
    // When 'a' is passed to the function 'changeA', a **new copy** of 'a' is made.
    // Any modification done inside the function affects only that local copy,
    // not the original variable in 'main()'.
    //
    // Hence:
    // 1. Inside 'changeA' → value becomes 20 (local copy changes)
    // 2. After returning to main() → value of 'a' is still 10 (original unchanged)
    //
    // In summary: Pass by Value = Copy of data is passed, so the real variable stays safe from modification.

    return 0;
}
