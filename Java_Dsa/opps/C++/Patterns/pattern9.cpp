#include<iostream>
using namespace std;

int main(){
    /*
           1
        1  2  1
     1  2  3  2  1
    */


    int num;
    cout<<"Enter the num: ";
    cin>>num;
    //outer loop
    for (int i = 0; i < num; i++)
    {
        //space printing
        for (int x = 0; x < num-i-1; x++)
        {
            cout<<"  ";
        }

        // p-1 printing

        for (int j = 0; j < i+1; j++)
        {
            cout<<j+1<<" ";
        }
        
        //p-2

        for (int y = 0; y < i; y++)
        {
            cout<<y+1<<" ";
        }
        cout<<endl;
    }
    return 0;
}