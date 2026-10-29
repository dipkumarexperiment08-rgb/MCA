class Product {
    int item;
    boolean isProducing = false;

    synchronized public void put(int item) {
        while (isProducing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.item = item;
        System.out.println("Produced: " + item);
        isProducing = true;
        notify();
    }

    synchronized public int get() {
        while (!isProducing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        isProducing = false;
        return item;
    }
}

class Producer extends Thread {
    Product p;

    Producer(Product p) {
        this.p = p;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            p.put(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Consumer extends Thread {
    Product p;

    Consumer(Product p) {
        this.p = p;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consumed:" + p.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Lab_26_1 {
    public static void main(String[] args) {
        Product p = new Product();
        Producer pd = new Producer(p);
        Consumer cn = new Consumer(p);
        pd.start();
        cn.start();
    }
}
