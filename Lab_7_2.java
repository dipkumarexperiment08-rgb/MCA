import java.util.Scanner;

public class Lab_7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter arrber");
        int arr = sc.nextInt();

        if(arr%2==0){
            System.out.println("arrber is Even");
        }
        else{
            System.out.println("arrber is odd");
        }
    }
}
