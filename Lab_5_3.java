import java.util.Scanner;

public class calculator{
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter Width");
    int w = sc.nextInt();
    
    System.out.println("Enter Height");
    
    int h = sc.nextInt();
    
    System.out.println("Answer is="+(w*h));
}
}