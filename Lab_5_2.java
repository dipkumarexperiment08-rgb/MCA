import java.util.Scanner;

public class Lab_5_2{
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter first arrber");
    int arr1 = sc.nextInt();
    
    System.out.println("Enter Second arrber");
    int arr2 = sc.nextInt();
    
    System.out.println("Enter Sign");
    char sign = sc.next().charAt(0);
    
    double result;
    
    switch(sign){
    case '+' :
        result = arr1+arr2;
        System.out.println("Answer is"+result);
        break;
    case '-' :
        result = arr1-arr2;
        System.out.println("Answer is"+result);
        break;
    case '*' :
        result = arr1*arr2;
        System.out.println("Answer is"+result);
        break;
    case '/' :
        result = arr1/arr2;
        System.out.println("Answer is"+result);
        break;
    case '%' :
        result = arr1%arr2;
        System.out.println("Answer is"+result);
        break;
    default:
        System.out.println("Invalid input");
        break;
    }
    
    }
}
