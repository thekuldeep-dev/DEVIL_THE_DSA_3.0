// import java.io.*;

// class Student implements Serializable{
//     String name;
//     int roll_no;
//     int age;


//     Student(String n, int roll,int age){
//         this.name = n;
//         this.roll_no=roll;
//         this.age= age;
//     }
// }
// public class student_checkSerilisation {
//     public static void main(String[] args) {
//         Student s = new Student("kuldeep", 1911, 19);

//     try{
//         FileOutputStream fos = new FileOutputStream("Studnet.txt");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);

//         oos.writeObject(s);

//         oos.close();
//         fos.close();

//         System.out.println("Serialization done");
//     }
//     catch(IOException e){
//         System.out.println(e.getMessage());
//     }
// }

//     }
// import java.io.*;    
// class Studnet implements Serializable{
//     String name;
//     int age;
//     int roll_no;

//     Studnet(String name, int age, int roll_no){
//         this.name = name;
//         this.age = age;
//         this.roll_no = roll_no;
//     }
// }

// public class student_checkSerilisation {
//     public static void main(String[] args) {
//         Studnet s = new Studnet("Kuldeep",19,0121);
//         try{
//             FileOutputStream fos = new FileOutputStream("Student.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(fos);

//             oos.writeObject(s);

//             oos.close();
//             fos.close();

//             System.out.println("serializble complete");
//         }
//         catch(IOException e){
//             System.err.println(e.getMessage());
//         }
//     } 
// }


// Desterialization code

import java.io.*;
class Student implements Serialzable{
    String name;
    int age;
    int roll_no;

    Student(String n, int a, int r){\
        this.name = n;
        this.age = a;
        this.roll_no = r;
    }
}
public class student_checkSerilisation {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student)ois.readObject();
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.roll_no);

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }    
}