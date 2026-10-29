
import java.util.Scanner;


public class Lab_23_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
try{
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    num2=Integer.parseInt("bgd");
    System.out.println("Result"+ num1/num2);
}

catch(ArithmeticException ae){
    System.err.println(ae.toString());
}

catch(NumberFormatException nfe){
    System.err.println(nfe.toString());
}
}
}
