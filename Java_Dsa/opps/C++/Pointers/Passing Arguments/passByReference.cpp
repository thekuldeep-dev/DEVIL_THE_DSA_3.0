#include<iostream>
using namespace std;

// pass by reference using Reference variable
void changeA(int &a){   //  'a' is passed by reference — the function receives the actual variable, not a copy.
    a = 45;             //  Directly changes the value of 'a' in main().
    cout << a << endl;  //  Prints 45 (shows updated value inside the function)
}

// Pass by reference using pointers
void ChangeA2(int *ptr){ //  'ptr' is a pointer — it stores the address of variable 'a'.
    *ptr = 65;           //  Dereferencing the pointer (*ptr) changes the original variable’s value.
    cout << *ptr << endl; //  Prints 65 (shows updated value using pointer)
}

int main(){
    int a = 20;          //  'a' is initialized with 20 in main.
    changeA(a);          //  Pass by reference — modifies 'a' directly to 45.
    cout << a << endl;   //  Prints 45 (reflects change made inside the function)

    // Summary of Pass by Reference:
    // ➤ Function directly accesses and modifies the original variable.
    // ➤ No copy of the variable is made.
    // ➤ Both 'a' in main and inside the function refer to the same memory location.
    // Output till now:
    // 45
    // 45

    ChangeA2(&a);        //  Pass by pointer — sending the address of 'a' to the function.
    cout << a << endl;   //  Prints 65 (reflects change made via pointer dereference)

    // Summary of Pass by Pointer:
    // ➤ The function receives the **address** of the variable.
    // ➤ Using *ptr, we access and modify the actual value at that address.
    // ➤ Works similar to pass by reference, but syntax involves pointers (& and *).
    //
    // Final Output:
    // 45
    // 45
    // 65
    // 65

    return 0;
}
