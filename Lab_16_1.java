import java.util.Scanner;

class Student {
    int id_no,     no_of_subjects;
    String[] subject_code;
    int[] subject_credits, grade;
    double spi;

    Student(int id, int n) {
        id_no = id;
            no_of_subjects = n;
        subject_code = new String[n];
        subject_credits = new int[n];
        grade = new int[n];
    }

    void calculate_spi() {
        int total = 0, credits = 0;

        for (int i = 0; i <     no_of_subjects; i++) {
            total += subject_credits[i] * grade[i];
            credits += subject_credits[i];
        }

        spi = (double) total / credits;
    }
}

public class Lab_16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID and number of subjects: ");
            int id = sc.nextInt();
            int subjects = sc.nextInt();

            s[i] = new Student(id, subjects);

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter subject code, credit and grade: ");
                s[i].subject_code[j] = sc.next();
                s[i].subject_credits[j] = sc.nextInt();
                s[i].grade[j] = sc.nextInt();
            }

            s[i].calculate_spi();
            System.out.println("SPI: " + s[i].spi);
        }

        sc.close();
    }
}