import java.util.Scanner;

public class Main{
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter first arrber");
    int arr1 = sc.nextInt();
    
    System.out.println("Enter Second arrber");
    int arr2 = sc.nextInt();
    
    System.out.println("Enter Third arrber");
    int arr3 = sc.nextInt();
    
    if(arr1 > arr2 && arr1>arr3){
        System.out.println("arrber 1 is largest");
    }
    else if(arr2>arr1 && arr2 > arr3){
             System.out.println("arrber 2 is largest");
    }
    
    else if(arr3 > arr2 && arr3 >arr1){
             System.out.println("arrber 3 is largest");
    }
    
    else if(arr1 == arr2 && arr1==arr3){
             System.out.println("All arrbers are in same value");
    }
    else if(arr1 == arr2 && arr2>arr1 && arr2>arr3){
             System.out.println("arrber 2 is largest");
    }
    
    else if(arr2 == arr1 && arr3>arr2 && arr3>arr2){
             System.out.println("arrber 3 is largest");
    }
    else if(arr3 == arr2 && arr2>arr3 && arr2>arr3){
             System.out.println("arrber 3 is largest");
    }
}
}