package opps.polymorphism;

public class calculator{
    // method overloading

    public int Add(int a , int b){
        return a+b;
    }

    public int Add(int a,int b, int c){
        return a+b+c;
    }

    public float Add(int a, float b){
        return a+b;
    }
}
