#include<iostream>
using namespace std;

int main(){
    // int *ptr;
    // cout<<ptr<<endl;   // its prints random value of address from memory.

    // so thats why we use null pointers


    // null pointer

    int *ptr = NULL;
    cout<<ptr<<endl;   //its prints 0 address. 




    // Deferencing not possible for NULL pointer 
    // Because its give segmentation fault.

    cout<< *ptr << endl;
    int *ptr2 = NULL;
    cout<<*ptr<<endl;   // its give segementation error.

    //but after give give valid adddress , all things worls as same as before.
    return 0;
}