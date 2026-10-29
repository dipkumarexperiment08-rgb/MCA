import java.util.Scanner;

class OutOfRangeException extends Exception {
    OutOfRangeException(String msg) {
        super(msg);
    }
}

public class Lab_23_3 {

    static void checkNumber(int n) throws OutOfRangeException {
        if (n < 10 || n > 50) {
            throw new OutOfRangeException("Out of Range enter number between 10 to 50");
        } else {
            System.out.println("Square = " + (n * n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            checkNumber(n);
        } catch (OutOfRangeException e) {
            System.out.println(e.toString());
        }

        sc.close();
    }
}