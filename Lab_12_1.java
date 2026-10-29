import java.util.Scanner;

public class Lab_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        Placement s1 = new Placement(marks);
        System.out.println("Enter marks");
        marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid ents bet should be ween 0 and 100");
        } else {
            s1.validateMarks(marks);
        }

    }
}

class Placement {
    int marks;

    Placement(int marks) {
        this.marks = marks;
    }

    void validateMarks(int m) {
        int marks = m;
        if (m >= 60) {
            System.out.println("Student is eligible for placement");
        } else {
            System.out.println("Student is not eligible for placement");
        }
    }

}
