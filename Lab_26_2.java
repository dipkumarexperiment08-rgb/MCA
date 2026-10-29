// Write a java program to print multiplication table of two numbers using Thread 
// Synchronization

class MyTable{
    synchronized public void disptable(int n)throws InterruptedException{
        for(int i = 1; i <=10; i++){
            System.err.println(n+"*"+i+"="+(n*i));
        }
    }
}

class MySyncThread extends Thread{
    MyTable t;
    int n;
    MySyncThread(MyTable t , int n){
        this.t = t;
        this.n = n;
    }

    public void run(){
        try{
            t.disptable(n);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
}

public class Lab_26_2 {
    public static void main(String[] args) {
        MyTable tab = new MyTable();

        MySyncThread th1 = new MySyncThread(tab, 5);
        MySyncThread th2 = new MySyncThread(tab, 11);
        MySyncThread th3 = new MySyncThread(tab, 15);
        th1.start();
        th2.start();
        th3.start();
    }
}
