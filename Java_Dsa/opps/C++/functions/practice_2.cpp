#include<iostream>
using namespace std;

void isEven(int a){
    if (a%2 == 0)
    {
        cout<<a<<" No. is Evem"<<endl;
    }
    else     cout<<a<<" No. is Odd"<<endl;
    
}

bool isOdd(int a){
    if(a%2 != 0){
        return true;
    }
    else return false;
}


int main(){
    isEven(5);
    isEven(4);
    isEven(19);
    cout<<isOdd(63)<<endl;     // 1 = true or 0 = false
}