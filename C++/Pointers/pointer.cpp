#include<iostream>
using namespace std;

int main(){
    int a = 56;
    int *ptr = &a;   // Pointers are the special variable that store address of another variable.
    cout<<&a<<" = "<<ptr<<endl;   // that are equals.


    // pointers for float datatype
    cout<<"Float pointer:-"<<endl;
    float pi = 3.14;
    float *ptr2 = &pi;
    cout<<&pi<<" = "<<ptr2<<endl;


    // lets see any difference between float pointer size or int ?
    cout<<"Size of pointer:-"<<endl;
    cout<<sizeof(ptr)<<endl;
    cout<<sizeof(ptr2)<<endl; 
    cout<<endl;

    //pointer of pointer to see pointer variable address
    cout<<"Pointer of pointer: "<<endl;
    int **pptr = &ptr;
    float **pptr2 = &ptr2;
    cout<<pptr<<endl;
    cout<<pptr2<<endl;
}