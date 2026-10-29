
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab_28_3 {
    public static void main(String[] args) throws IOException {
        int x;
        FileInputStream fis = new FileInputStream("File5.txt");
        FileOutputStream fos = new FileOutputStream("File6.txt");

        while ((x = fis.read()) != -1) {
            fos.write(x);
        }
        fis.close();
        fos.close();
        System.out.print("File copied");
    }
}
