class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void AddSeconds(int seconds) {
        sec = sec + seconds;

        if (sec >= 60) {
            min = min + sec / 60;
            sec = sec % 60;
        }

        if (min >= 60) {
            hr = hr + min / 60;
            min = min % 60;
        }
    }

    void SubtractSeconds(int seconds) {
        sec = sec - seconds;

        if (sec < 0) {
            sec = sec + 60;
            min--;
        }

        if (min < 0) {
            min = min + 60;
            hr--;
        }
    }

    void display() {
        System.out.printf("%02d : %02d : %02d%n", hr, min, sec);
    }
}

public class Lab_14_4 {
    public static void main(String[] args) {

        Time t = new Time(2, 30, 45);

        t.AddSeconds(50);
        System.out.print("Time after adding seconds = ");
        t.display();

        t.SubtractSeconds(30);
        System.out.print("Time after subtracting seconds = ");
        t.display();
    }
}