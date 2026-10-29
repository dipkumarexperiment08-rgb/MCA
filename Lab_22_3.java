import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}



public class Lab_22_3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
try{
    if(age<18){
        throw new AgeException("Age must be 18 or above");
    }

    else{
        System.err.println("You are eligible");
    }

}    catch(AgeException ae){
        System.out.println(ae.toString());
    }
} 
}
