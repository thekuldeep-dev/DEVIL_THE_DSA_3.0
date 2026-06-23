#include<iostream>
using namespace std;

int main(){
    float a , b;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter the b: ";
    cin>>b;
    char choice;
    cout<<"Enter the choice\n1. +\n2. -\n3. *\n4. /"<<endl;
    cin>>choice;
    switch (choice)
    {
    case '+':
        cout<<"a+b = "<<a+b;
        break;
    case '-':
        cout<<"a-b = "<<a-b;
        break;
    case '*':
        cout<<"a*b = "<<a*b;
        break;
    case '/':
        cout<<"a/b = "<<a/b;
        break;        
    default: cout<<"Invalid choice!";
        break;
    }
}