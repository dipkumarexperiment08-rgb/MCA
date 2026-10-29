import java.util.Scanner;

public class Lab_10_2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter string: ");
    String s1=sc.next();
    // String s1="Stream";
    for(int i=0; i<s1.length();i++){
        for(int j=0;j<=i;j++){
          System.out.print(s1.charAt(j));
        }
        System.out.println();
    }
}
}

