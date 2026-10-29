import java.util.Scanner;

public class Lab_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrber 1");
        int a = sc.nextInt();

        System.out.println("Enter arrber 2");
        int b = sc.nextInt();

        System.out.println("Enter arrber 3");
        int c = sc.nextInt();

        int max = (a >= b)
                ? ((a >= c) ? a : c)
                : ((b >= c) ? b : c);

            System.out.println("Largest arrber is:="+max);
    }

}
