interface Car{
    public void moverForward();
    public void moverBackward();
    public void moveLeft();
    public void moveRight();
    public void applyBreak();
}

class Swift implements Car{
    @Override
     public void moverForward(){
        System.out.println("Swift moves forward");
     }
     @Override
    public void moverBackward(){
        System.out.println("Swift moves backward");
    }
    @Override
    public void moveLeft(){
        System.out.println("Swift moves left");
    }
    @Override
    public void moveRight(){
        System.out.println("Swift moves Right");
    }
    @Override
    public void applyBreak(){
        System.out.println("Swift applies break");
    }
}


class Trar implements Car{
    @Override
     public void moverForward(){
        System.out.println("Thar moves forward");
     }
     @Override
    public void moverBackward(){
        System.out.println("Thar moves backward");
    }
    @Override
    public void moveLeft(){
        System.out.println("Thar moves left");
    }
    @Override
    public void moveRight(){
        System.out.println("Thar moves Right");
    }
    @Override
    public void applyBreak(){
        System.out.println("Thar applies break");
    }
}

public class Lab_21_1 {
    public static void main(String[] args) {
        Car s= new Swift();
        s.moverForward();
        s.moverBackward();
        s.moveLeft();
        s.applyBreak();

        Car t = new Trar();
        t.moverForward();
        t.moverBackward();
        t.moveLeft();
        t.applyBreak();
    }
}
