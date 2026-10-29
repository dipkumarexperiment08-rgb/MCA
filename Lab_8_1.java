import java.util.Scanner;

public class Lab_8_1 {
    
    static boolean isprime(int arr){
        if(arr<=1){
            return true;
        }
        for(int i=2; i<=Math.sqrt(arr);i++){
            if(arr%i==0){
                return false;
            }
            
            
        }
        return true;
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.println("Enter arrber");
        int arr = sc.nextInt();
        if (isprime(arr)) {
            System.out.println(arr + " is a prime arrber");
        }
        else{
            System.out.println(arr + " is not a prime arrber");
        }
    }
}
