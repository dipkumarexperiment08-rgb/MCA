interface EventListener {
    void perfoemEvent();
}

interface MouseListener extends EventListener {
    public void mouseClicked();

    public void mousePressed();

    public void mouseReleased();

    public void mouseMoved();

    public void mouseDragged();
}

interface KeyListener extends EventListener {
    public void keyPressed();

    public void keyReleased();
}

class EventDemo implements MouseListener , KeyListener{

    @Override
    public void perfoemEvent(){
        System.out.println("Event performed");
    }

    @Override
    public void mouseClicked(){
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(){
        System.out.println("Mouse clicked");
    }

    @Override
    public void mouseReleased(){
        System.out.println("Mouse released");
    }

    @Override
    public void mouseMoved(){
        System.out.println("Mouse moved");
    }

    @Override
    public void mouseDragged(){
        System.out.println("Mouse dragged");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased(){
        System.out.println("Key released");
    }

    
}

public class Lab_20_2 {
    public static void main(String[] args) {
        EventDemo e= new EventDemo();

        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();

    }
}
