#include<iostream>
using namespace std;

int main(){
    /*
             *
           * * *
         * * * * *
    */

    int num;
    cout<<"Enter the value of num: ";
    cin>>num;
    for (int i = 0; i < num; i++)
    {
        //space printing
        for (int x = num-1; x>i ; x--)
        {
            cout<<"  ";
        }
        

        // star printing
        for (int j = 0; j < i+1 ; j++)
        {
            cout<<"*"<<" ";
        }


        // another attached p2 pattern

        for (int y = 0; y < i; y++)
        {
            cout<<"*"<<" ";
        }
        
        cout<<endl;
    }
    return 0;
}