class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class Lab_24_1_1 {
public static void main(String[] args) {
    Mythread m1 = new Mythread();

    m1.start();
}
}