import java.util.Random;

class SqThread extends Thread {
    private int number;

    public SqThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread {
    private int number;

    public CubeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

class NumThread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int num = random.nextInt(100);
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    SqThread sThread = new SqThread(num);
                    sThread.start();
                } else {
                    CubeThread cThread = new CubeThread(num);
                    cThread.start();
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Lab_26_3 {
    public static void main(String[] args) {
        NumThread generator = new NumThread();
        generator.start();
    }
}
