#include<iostream>
using namespace std;


// int wrongfunction(int a = 2, int b){     //its wrong function delclaration
//     return a*b;
// }
int product(int a = 2, int b = 4){     // if 
    return a*b;
}

int main(){
    int p1 =product(5,8);
    int p2 =product(8);
    int p3 =product(5,8);
    // int w1 =wrongfunction(8);     // in this its dont where 8 store in a or b ? 
    cout<<"p1 = "<<p1<<endl;
    cout<<"p2 = "<<p2<<endl;
    cout<<"p3 = "<<p3<<endl;
    // cout<<w1;
}