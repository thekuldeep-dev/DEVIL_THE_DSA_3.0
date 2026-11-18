
import java.io.*;

public class Create_File {
    public static void main(String[] args) {
        try {
            File f = new File("Story_OF_HUMAN_LIFE.txt");

            if (f.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
