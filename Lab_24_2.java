class GoodMorning implements  Runnable{
    public void run(){
        System.err.println("Good Morning");
        try{
        Thread.sleep(1000);
    }
    catch(Exception e){
        System.err.println(e.toString());
    }
    }
}


class GoodAfternoon implements  Runnable{
    public void run(){
        System.err.println("Good Afternoon");
        try{
        Thread.sleep(1000);
    }
    catch(Exception e){
        System.err.println(e.toString());
    }
    }
}

public class Lab_24_2 {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        GoodAfternoon gf = new GoodAfternoon();
        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(gf);
        t1.start();
        t2.start();
    }
}
