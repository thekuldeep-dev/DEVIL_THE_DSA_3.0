public class student {
    // Attributes

    public int id;
    public int age;
    public String name;
    public int nos;
    

    //default ctor :- A default constructor is a constructor with no parameters. Instance variables automatically receive Java's default values if we don't initialize them.
    public student(){
        System.out.println("student default ctor called");
    }

    // parametrized constructor(ctor)
    public student(int id, int age, String name, int nos){
        System.out.println("parametrised ctor called..");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy constructor

    public student(student srcobj){
        //scrcobj is signify that object use in this A
        System.out.println("copy ctor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // methods/function/behavoir

    public void study(){
        System.out.println(name + " Studying");
    }

    public void bunk(){
        System.out.println(name + " bunk");
    }

    public void sleep(){
        System.out.println(name + " sleep");
    }
}
