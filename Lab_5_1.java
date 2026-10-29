import java.util.Scanner;

public class Lab_5_1{
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter first arrber");
    int arr1 = sc.nextInt();
    
    System.out.println("Enter Second arrber");
    
    int arr2 = sc.nextInt();

    System.out.println("Enter Sign");
    char sign = sc.next().charAt(0);

    if(sign == '+'){
        System.out.println("Addition is:"+(arr1+arr2));
    }

    else if(sign == '-'){
        System.out.println("Substaction is:"+(arr1-arr2));
    }

    else if(sign == '*'){
        System.out.println("Multiplication is:"+(arr1*arr2));
    }

    else if(sign == '/'){
        System.out.println("Division is:"+(arr1/arr2));
    }
    else if(sign == '%'){
        System.out.println("Modulus is:"+(arr1%arr2));
    }

    else{
        System.out.println("Not valid sign");
    }
}
}