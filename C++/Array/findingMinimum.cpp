#include<iostream>
using namespace std;

int main(){
    int arr[]={4,5,8,7,3};
     int ans = arr[0];
    
    //for finding minimum
    for (int i = 0; i < 5; i++)
    {
       if (ans>=arr[i])
       {
        ans = arr[i];
       }
       
    }
    cout<<"Minimum value:- "<<ans;
    return 0;
}