import java.util.Scanner;

class InsufficientRunException extends Exception {

    public InsufficientRunException(String msg) {
        super(msg);
    }
}

class Cricket {
    void display(int run) {
        System.out.println("Entered run is: " + run);
    }
}

public class Lab_23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Run");
        int run = sc.nextInt();

        Cricket c = new Cricket();
        try {
            if (run > 6) {
                throw new InsufficientRunException("run is not possible in  one ball");
            }
        }

        catch (InsufficientRunException ir) {
            System.err.println(ir.toString());
        }
    }
}