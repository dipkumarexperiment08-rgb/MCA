
import java.io.*;

public class Lab_27_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("File1.txt");
            FileOutputStream fio = new FileOutputStream("File3.txt");

            int ch;
            while ((ch = fin.read()) != -1) {
                fio.write(ch);
            }

            fin.close();
            fio.close();

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
