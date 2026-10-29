interface Transport{
    public void delever();
}


abstract class Animal{
    abstract void sound();
}

class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger makes sound");
    }
}

class Camel extends Animal implements Transport{
    @Override
    public void sound(){
        System.out.println("Camel makes sound");
    }

    @Override
    public void delever(){
        System.out.println("Camel can delever");
    }
}

class Deer extends Animal{
    @Override
    public void sound(){
        System.out.println("Deer makes sound");
    }
}

class Donkey extends Animal implements Transport{
    @Override
    public void sound(){
        System.out.println("Donkey makes sound");
    }

    @Override
    public void delever(){
        System.out.println("Donkey can delever");
    }
}


public class Lab_20_3 {
    public static void main(String[] args) {
        Animal a[] = {
            new Tiger(),
            new Camel(),
            new Deer(),
            new Donkey()
        };

        for(int i = 0; i<a.length; i++){
            a[i].sound();

            if(a[i] instanceof Transport){
                ((Transport) a[i]).delever();
            }
        }
    }
}
