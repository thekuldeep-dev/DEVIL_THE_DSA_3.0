#include<iostream>
using namespace std;

int main(){
    int a = 10;
    int *ptr = &a;
    cout<<&a<<endl;
    cout<<*(&a)<<endl;  //Derefernce its prints 10
    cout<<*ptr<<endl;

    // its also able to modify value
    *ptr = 20;
    cout<<a<<endl;
    *(&a) = 40;
    cout<<a<<endl;
    return 0;

}