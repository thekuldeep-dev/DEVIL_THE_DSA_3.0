#include<iostream>
using namespace std;

int main(){
    float a , b;
    cout<<"Enter a: ";
    cin>>a;
    cout<<"Enter the b: ";
    cin>>b;
    int choice;
    cout<<"Enter the choice\n1. +\n2. -\n3. *\n4. /"<<endl;
    cin>>choice;
    switch (choice)
    {
    case 1:
        cout<<"a+b = "<<a+b;
        break;
    case 2:
        cout<<"a-b = "<<a-b;
        break;
    case 3:
        cout<<"a*b = "<<a*b;
        break;
    case 4:
        cout<<"a/b = "<<a/b;
        break;        
    default: cout<<"Invalid choice!";
        break;
    }
}