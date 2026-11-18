
import java.io.*;

public class Write_File {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("Story_OF_HUMAN_LIFE.txt");

            w.write("Human are intelligent species \n By Bhanu");
            w.close();

            System.out.println("Story written successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
