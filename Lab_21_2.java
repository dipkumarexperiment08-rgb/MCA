interface Playable{
    public void play();
}


class Football implements  Playable{
    public void play(){
        System.out.println("Player is playing Football");
    }
}

class Vollyball implements Playable{
    public void play(){
        System.out.println("Player is playing Vollyball");
    }
}
    class Basketball implements Playable{
        public void play(){
        System.out.println("Player is playing Basketball");
        }
}



public class Lab_21_2 {
public static void main(String[] args) {
    Playable p;
    p = new Football();
    p.play();
    p = new Vollyball();
    p.play();
    p = new Basketball();
    p.play();
}    
}
