public class run {
    
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, I'M Back...");
        
        // //default ctor
        // student A = new student();
        // A.id = 1;
        // A.age = 19;
        // A.name = "Kuldeep";
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);

        // A.study();
        // A.bunk();
        // A.sleep();

        // calling parametrised ctor

        student A = new student(1,19,"Kulddep",6);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.study();
        // A.bunk();
        // A.sleep();


        // copy ctor
        student B = new student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);
    }
}
