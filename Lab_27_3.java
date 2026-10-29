import java.io.*;

public class Lab_27_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("File4.txt"));

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("File5.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String name = data[0].split(":")[1].trim();
            String subject = data[1].split(":")[1].trim();
            int marks = Integer.parseInt(
                    data[2].split(":")[1].trim());

            double percentage = (marks / 100.0) * 100;

            bw.write("Student Name: " + name
                    + ", Subject: " + subject
                    + ", Marks: " + marks
                    + ", Percentage: " + percentage + "%");

            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Percentage calculated!.");
    }
}