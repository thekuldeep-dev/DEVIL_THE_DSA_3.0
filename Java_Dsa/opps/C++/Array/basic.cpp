#include<iostream>
using namespace std;

int main(){
    int arr[8];

    // taking input
    cout<<"Taking Input:";
    for (int i = 0; i < 8; i++)
    {
        cin>>arr[i];
    }

    
    //Printing Output
    cout<<"Printing Array:-";
    
    for (int i = 0; i < 8; i++)
    {
        cout<<arr[i]<<endl;
    }
    return 0;
}