abstract class Vegitable{
    String color;

    Vegitable(String color){
        this.color = color;
    }

            public abstract String toString();
}


class Potato extends Vegitable{
    Potato(String color){
        super(color);
    }

    public String toString(){
        return "Potato color:" + color;
    }
}

class Brinjal extends Vegitable{
    Brinjal(String color){
        super(color);
    }

    public String toString(){
        return "Brinjal color"+ color;
    }
}


class Tomato extends Vegitable{
    Tomato(String color){
        super(color);
    }
    public String toString(){
        return "Tomato color"+color;
    }
}

public class Lab_18_1 {
    public static void main(String[] args) {
        
    Vegitable v1 = new Potato("Brown");
    Vegitable v2 = new Brinjal("gray");
    Vegitable v3 = new Tomato("Red");
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    }
}
