import java.util.Scanner;

public class Lab_7_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of Subject 1");
        int sub1 = sc.nextInt();

        System.out.println("Enter Marks of Subject 2");
        int sub2 = sc.nextInt();

        System.out.println("Enter Marks of Subject 3");
        int sub3 = sc.nextInt();

        System.out.println("Enter Marks of Subject 4");
        int sub4 = sc.nextInt();

        System.out.println("Enter Marks of Subject 5");
        int sub5 = sc.nextInt();

         double per = (sub1+sub2+sub3+sub4+sub5)/5;

         System.out.println("Percentage is:="+per);

         if(per>=60){
            System.out.println("First Division");
         }
        else if(per>=50 && per<=59){
            System.out.println("Second Division");
        }
        else if(per>=40 && per<=49){
            System.out.println("Third Division");
        }
        else if(per<40){
            System.out.println("Fail");
        }
    }
}
