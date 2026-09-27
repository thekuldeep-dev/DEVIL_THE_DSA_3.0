class animal {
   int age = 19;

   public animal() {
      System.out.println("animal ctor called..");
   }

   public void eat() {
      System.out.println("Animals eat foods....");
   }
}


class dog extends animal {
   int age = 20;

   public dog() {
      System.out.println("dog ctor called..");
   }

   public void bark() {
      System.out.println("Dogs bark on strangers..");
   }

   public void showAge() {
      System.out.println(super.age);
   }
}


public class inheritance_1 {

    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
    }
    
}
