import java.util.Scanner;

class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    Time AddTime(Time t2) {
        int total_sec = this.sec + t2.sec;
        int total_min = this.min + t2.min;
        int total_hr = this.hr + t2.hr;

        if (total_sec >= 60) {
            total_sec = total_sec - 60;
            total_min++;
        }

        if (total_min >= 60) {
            total_min = total_min - 60;
            total_hr++;
        }

        return new Time(total_hr, total_min, total_sec);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }
}

public class Lab_14_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time 1 (Hour Minute Seconds): ");
        int hr1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();

        System.out.print("Enter Time 2 (Hour Minute Seconds): ");
        int hr2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();

        Time t1 = new Time(hr1, min1, sec1);
        Time t2 = new Time(hr2, min2, sec2);

        Time result = t1.AddTime(t2);

        System.out.print("Result: ");
        result.display();

        sc.close();
    }
}