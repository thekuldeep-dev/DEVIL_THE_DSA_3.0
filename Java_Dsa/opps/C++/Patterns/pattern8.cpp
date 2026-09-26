// #include<iostream>
// using namespace std;

// int main(){

    /*
        * * * * *
          * * *
            *
    */

//     int num;
//     cout<<"Enter the value of num: ";
//     cin>>num;

//     // outer loop (row)
//     for (int i = 0; i < num; i++)
//     {
//         //space priting
//         for (int x = 0; x < i; x++)
//         {
//             cout<<"  ";
//         }

//         // p-1 stars printing

//         for (int j = 0; j < num-i; j++)
//         {
//             cout<<"*"<<" ";
//         }


//         //p-2 stars priniting

//         for (int y = 0; y < num-i-1; y++)
//         {
//             cout<<"*"<<" ";
//         }
        
//         cout<<endl;
//     }
//     return 0;
// }







// another approach, we dont divide in two parts


#include<iostream>
using namespace std;

int main(){

    int num;
    cout<<"Enter the value of num: ";
    cin>>num;
    int k = 1;

    // outer loop (row)
    for (int i = 0; i < num; i++)
    {
        // space print
        for (int x = 0; x < i; x++)
        {
            cout<<"  ";
        }
        
        // star print

        for (int j = 0; j < 2*num-k; j++)
        {
            cout<<"*"<<" ";
        }
        k +=2;
        cout<<endl;
    }
    return 0;
}