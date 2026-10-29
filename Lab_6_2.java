import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        System.out.println("Enter arrber");
        double arrber = sc.nextDouble();

        if((arrber%2)==0){
            System.out.println("arrber is Even");
        }
        else{
            System.out.println("arrber is Odd");
        }
    }
}
