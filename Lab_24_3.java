class Odd implements Runnable {
    public void run() {
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd " + i);
            }
        }
    }
}

class Even implements Runnable {
    public void run() {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even " + i);
            }
        }
    }
}

public class Lab_24_3 {
    public static void main(String[] args) {
        Odd O = new Odd();
        Even E = new Even();
        Thread T1 = new Thread(O);
        Thread T2 = new Thread(E);
        T1.start();
        T2.start();

    }
}
