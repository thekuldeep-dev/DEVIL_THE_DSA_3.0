#include<iostream>
using namespace std;

int main(){
    /*
       * * * *
       * * * * 
       * * * * 
       * * * * 
    */

    int num;
    cout<<"Enter value of num: ";
    cin>>num;

    // its for row changing
    for (int i = 0; i < num; i++)
    {
        // its for whAT print/col

        for (int i = 0; i < num; i++)
        {
            cout<<"*"<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}