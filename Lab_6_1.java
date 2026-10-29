import java.util.Scanner;

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of Subject 1");
        int sub1 = sc.nextInt();

        System.out.println("Enter Marks of Subject 2");
        int sub2 = sc.nextInt();

        System.out.println("Enter Marks of Subject 3");
        int sub3 = sc.nextInt();

        System.out.println("Enter Annual Income");
        int income = sc.nextInt();

        int per = (sub1+sub2+sub3)/3;

        System.out.println("Percentage is:" + per);
        if (per >= 75 && income < 250000) {
            System.out.println("You are eligible for scholership");
        } else {
            System.out.println("You are not eligible for scholarship");
        }
    }
}
