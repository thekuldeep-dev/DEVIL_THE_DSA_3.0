class animal{
    public animal(){
        System.out.println("animal ctor called..");
    }
    int age = 19;
    public void eat(){
        System.out.println("Animals eat foods....");
    }
}

class dog extends animal{
    int age = 20;
    public dog(){
        System.out.println("dog ctor called..");
    }
    public void bark(){
        System.out.println("Dogs bark on strangers..");
    }
    //System.out.println(super.age);  --> error gives

    public void showAge(){
        //System.out.println(age);
        System.out.println(super.age);
    }
}

public class inheritance{
    public static void main(String args[]){
        dog d1 = new dog();
        d1.bark();
        System.out.println(d1.age);
        d1.showAge();
    }
}