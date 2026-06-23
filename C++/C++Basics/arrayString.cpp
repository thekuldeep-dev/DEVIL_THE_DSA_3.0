#include<iostream>
using namespace std;

// array are used for many values with same data type,
// because its not good to create many variable for store many values. 

int main(){
    // //1D Array
    // int arr[5];
    // cin>>arr[0]>>arr[1]>>arr[2]>>arr[3]>>arr[4];

    // arr[3] += 10;
    // cout<<arr[3];

    // // index are store in congicutive memoery allocation.



    // 2D array
    // int arr[3][5];  //row or col
    // arr[1][3] = 78;
    // cout<< arr[1][3];    // in all index garbage value stored on that location.

    // string

    string s = "DeViL";  // every char stores in index.  so string stores characters with itself.
    int len = s.size();
    cout<<s[2];
    s[len-2] = 'z';
    cout<<s[len-1];
    return 0;
}