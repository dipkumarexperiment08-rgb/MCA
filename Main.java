import java.util.Scanner;

public class Main{
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    double c;
    System.out.println("Enter Fahrenheit");
    int f = sc.nextInt();
    
    c= f- 32*5/9;
    
    System.out.println("Celcius is:"+c);
}
}
