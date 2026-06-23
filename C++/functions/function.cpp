#include<iostream> 
using namespace std;

void hello(){       // function declaration
    cout<<"Hello World"<<endl;    // function defination
}

void assistant(){
    hello();    // function calling
    cout<<"Work Done"<<endl;
}

int sum(int a, int b){    // a, b are parameters in function
    return a+b;
}
int main(){
    // hello();    // function calling
    // hello();
    // hello();
    // assistant();
    cout<<"Sum = "<<sum(5,7);   // 5,7 are arguments in function
    return 0;
}