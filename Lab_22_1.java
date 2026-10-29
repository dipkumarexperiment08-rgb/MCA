import java.util.Scanner;

public class Lab_22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
        System.out.println("Result: "+(num1/num2));
        }

        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception "+ ae.toString());
        }
        try {
            int[] arr = {10,20,30};

            System.out.println(arr[8]);
        } 

        catch(ArrayIndexOutOfBoundsException ae){
            System.err.println("ArrayIndex Out Of BoundsException "+ ae.toString());
        }
           }
        

        
}
