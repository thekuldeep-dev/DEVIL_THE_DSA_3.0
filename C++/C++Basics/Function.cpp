#include<iostream>
using namespace std;

// Functions are set of code which performs somthing for me
// Functions are used to mudularise code
// Functions are used to increase readability and use same code multiple times
// types:->1.void -> which does not returns anything
// 2.return
// 3.parametrised
// non paramatersed


//void
// void printName(){
//     cout<<"Kuldeep"<<endl;
// }


// Parametrised void
// void PrintName1(string name){
//     cout<<"Hey "<<name<<endl;
// }

//return function :-> in this must write return.
// int sum(int a, int b){
//     int num3 = a + b;
//     return num3;
// }



//pass by value :-> means only copies going not onriginal no./memory/string or any value
//  so if we print no. in main its same as original value
void doSomething(int num){
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
}


//pass by refencence :- int this functions able to change original value.
void doSomething1(int &num){
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
    num+=5;
    cout<<num<<endl;
}
 
main(){
    // string name;
    // cin>>name;
    // PrintName1(name);
    // printName();

    // int num1, num2;
    // cin>>num1>>num2;

    // int res = sum(num1, num2);
    // cout<<res;



    // math.h library give us inbulit math fucntios support.
    // functions names are different from inbulit functions name.
    // int num1, num2;
    // cin>>num1>>num2;
    // int minimum = min(num1, num2);
    // cout<<minimum;



    int num = 10;
    doSomething(num);
    cout<<"original = "<<num<<" After pass by value"<<endl;
    doSomething1(num);
    cout<<"original = "<<num<<" After pass by refernce"<<endl;

    //Note-> but arrays are always in pass by reference except other.
    return 0;
}