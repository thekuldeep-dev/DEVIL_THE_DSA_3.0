// example _ 1

class vehicle{
    String name;
    String model_name;
    int model_no;
    int noOfTyres;

    // default ctor
    // public vehicle(){
    //     System.out.println("Default constructor calls");
    // }

    public vehicle(String name, String model_name, int model_No, int noOftyres){
        this.name = name;
        this.model_name = model_name;
        this.model_no = model_No;
        this.noOfTyres = noOftyres;
    }

    public void start_engine(){
        System.out.println("Engine starts " + name);
    }

    public void stop_engine(){
        System.out.println("Engine stops " + name);
    }
}

class motorcylce extends vehicle{
    String handleBarStyle;
    String suspension_tightness;

    public motorcylce(String name, String model_name, int model_No, int noOftyres, String handleStyle, String suspension_tightness){
        super(name, model_name, model_No, noOftyres);
        this.handleBarStyle=handleStyle;
        this.suspension_tightness=suspension_tightness;
    }

    public void kickStart(){
        System.out.println("bike starts by kick start " + name);
    }

}



class car extends vehicle{
    int noOfDoors;
    String transmission_type;

    public car(String name, String model_name, int model_No, int noOftyres, int noOfDoors,String transmission){
        super(name, model_name, model_No, noOftyres);
        this.noOfDoors = noOfDoors;
        this.transmission_type = transmission;
    }


    public void start_ac(){
        System.out.println("ac on "+ name);
    }
}

class truck extends  vehicle{
    String name = "TATA";
    String axle_type;
    int BigTank_capacity;

    public truck(String name, String model_name, int model_No, int noOftyres, String axle,int tankCapacity ){
        super(name, model_name, model_No, noOftyres);
        this.BigTank_capacity = tankCapacity;
        this.axle_type = axle;
    }

    public void show_name(){
        System.out.println(name);
        System.out.println(super.name);
    }
    
}


public class inheritacne_main {
    public static void main(String[] args) {
        truck tk = new truck("BMW", "Ghost", 19, 18, "uplfiting axle", 900);
        tk.show_name();
        tk.start_engine();
        tk.stop_engine();

        car c = new car("Range Rover", "Vellar", 78,4, 4, "Automatic");
        System.out.println(c.model_name);
        c.start_engine();
        c.start_ac();
        c.stop_engine();
    }
}
