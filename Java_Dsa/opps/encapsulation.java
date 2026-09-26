class student{
    String name;
    private String gf_name;
    public student(String name,String gfName){
        this.name = name;
        this.gf_name = gfName;
    }

    //getter and setter work as security layer in ecapsulation.
    
    //getter
    public void get_gfName(){
        System.out.println(gf_name);
    }

    //setter
    public void set_gfName(String new_gfname){
        this.gf_name = new_gfname;
    }
    private void gf_chatting(){
        System.out.println("chatting info");
    }


}

public class encapsulation {
    public static void main(String[] args) {
        student s = new student("kuldeep", "arravya");

        System.out.println(s.name);
        // System.out.println(s.gf_name); --> gives error due to its private

        // s.gf_chatting(); --> also give error due to private


        // we able to see gfname by getter or set name by setter

        s.get_gfName();
        s.set_gfName("Arohi");
        s.get_gfName();
    }
}
