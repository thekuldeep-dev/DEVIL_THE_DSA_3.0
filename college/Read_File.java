
import java.io.*;

public class Read_File {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("Story_OF_HUMAN_LIFE.txt");
            int ch;

            while ((ch = r.read()) != -1) {
                System.out.print((char) ch);
            }

            r.close();

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
