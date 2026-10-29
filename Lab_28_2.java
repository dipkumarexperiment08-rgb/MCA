
import java.io.FileInputStream;
import java.io.IOException;

public class Lab_28_2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("File4.txt");{
            int x , count = 0;
            while((x = fis.read())!=-1){
                char ch = (char) x;

                if(ch == '5'){
                    count++;
                }
            }
            System.out.println("Count of 5 is: "+count);
        }
    }
}
