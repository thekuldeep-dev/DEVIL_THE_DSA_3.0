// #include<bits/stdc++.h>  //its include all the C++ library
#include<iostream>   // this library iostream used for taking input and get output.
using namespace std;  //after this writtien program always use std::

int main(){
    std::cout<<"Hey Kuldeep\n";
    int x;


    // Data types:  depending on memory use we choose datatypes.

                // 1.Primitive Data type:- int, float, double, char, bool, long.
                // 2.Derived DataType:- pointers, array, function type, reference.
                // 3.User Defined:- Struct, Classes
                //4.Non-Primitive:- string, arraye, etc.
        // Primitive Types (fixed in size and stored directly in memory):
        // byte, short, int, long for integers of increasing size.
        // float, double for floating-point numbers.
        // char for Unicode characters.


        // Non-Primitive (Reference) Types:
        // These include objects like String, arrays, user-defined classes, and interfaces. A reference type variable holds a memory address pointing to the actual object in the heap.
        // boolean for logical true/false values.

    //Strig and getline

    // string s1;
    // cin>> s1;
    // cout<<s1;    // its only print whose before the space, for after space we need new string variable s2.    


    // string s1;
    // getline(cin,s1);  // its print the whole line with spaces but not another line
    // cout<<s1;


    //char
    // char ch = 'g';    // for single characters.
    // cout<<ch;



    // IF Else

    int marks;
    cin>>marks;


    // its not optimal approach

    if (marks<25)
    {
        cout<<"F";
    }
    if (marks>=25 && marks<45)
    {
        cout<<"E";
    }
    if (marks>=45 && marks<50)
    {
        cout<<"D";
    }
    if (marks>=50 && marks<60)
    {
        cout<<"C";
    }
    if (marks>=60 && marks<80)
    {
        cout<<"B";
    }
    if (marks>=80 && marks<=100)
    {
        cout<<"A"<<endl;
    }
    
    

    // for optimal appraoch we use else if so our all condtions not executed and take more time.
    cout<<"\nBy optimal appraoch\n";
    int marks1;
    cin>>marks1;

    if (marks1<25)
    {
        cout<<"F";
    }
    else if (marks1<45)
    {
        cout<<"E";
    }
    else if (marks1<50)
    {
        cout<<"D";
    }
    else if (marks1<60)
    {
        cout<<"C";
    }
    else if (marks1<80)
    {
        cout<<"B";
    }
    else if (marks1<=100)
    {
        cout<<"A";
    }
    return 0;
}