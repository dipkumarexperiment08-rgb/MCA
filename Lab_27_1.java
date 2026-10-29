
import java.io.*;

public class Lab_27_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("File1.txt");

        int ch;
        String word = "Darshan";
        String replace = "DU";
        String txt = "";

        while ((ch = fin.read()) != -1) {
            txt += (char) ch;
        }
        fin.close();
        System.out.println("Text: " + txt);
        int count = 0;
        int index = 0;

        while ((index = txt.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        String ans = txt.replace(word, replace);

        FileOutputStream fout =
                new FileOutputStream("File2.txt");

        fout.write(ans.getBytes());
        fout.close();

        System.out.println("Number of replacements: " + count);
        System.out.println("Replaced content written to File2.txt");
    }
}
