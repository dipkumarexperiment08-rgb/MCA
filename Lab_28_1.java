
import java.io.*;

public class Lab_28_1 {
        public static void main(String[] args) throws IOException{
            FileInputStream fis = new FileInputStream("File4.txt");
                int ch;
                int chars=0 , words = 0 , lines =1;
                boolean isword = false;

                while((ch = fis.read())!=-1){
                    chars++;
                }
                if(ch == ' ' || ch == '\n' || ch == '\t' || ch == '\r'){
                    isword = false;
                }
                else{
                    words++;
                    isword = true;
                }
                System.out.println("Characters:"+chars);
                System.out.println("Words:"+words);
                System.out.println("Lines:"+lines);
                fis.close();
            }
            
        }
