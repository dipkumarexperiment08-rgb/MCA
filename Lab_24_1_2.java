class Mythread implements Runnable{
    public void run(){
        System.err.println("Thread is running");
    }
}

public class Lab_24_1_2 {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
