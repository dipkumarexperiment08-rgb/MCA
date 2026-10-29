class Hospital{
    void displayServices(){
        System.out.println("General Services");
    }
}

class Cardiology extends Hospital{
    @Override
    void displayServices(){
        System.out.println("Cardiology Department");
    }
}

class Neurology extends Hospital{
    @Override
    void displayServices(){
        System.out.println("Neurology Department");
    }
}

class Orthopedics extends Hospital{
    @Override
    void displayServices(){
        System.out.println("Orthopedics Department");
    }
}


public class Lab_19_2 {
public static void main(String[] args) {
    Hospital h1 = new Cardiology();
    h1.displayServices();
    Hospital h2 = new Neurology();
    h2.displayServices();
    Hospital h3 = new Orthopedics();
    h3.displayServices();
}    
}