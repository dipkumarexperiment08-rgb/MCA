class Vehicle {
    void display(){
        System.out.println("Vehicle is moving");
    };
    
}

class Car extends Vehicle{
    @Override
    void display(){
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle{
    @Override
    void display(){
    System.out.println("Bike is moving");
    }
}

class Bus extends Vehicle{
    @Override
    void display(){
        System.out.println("Bus is moving");
    }
}


public class Lab_19_1 {
    public static void main(String[] args){
    Vehicle c = new Car();
    c.display();

    Vehicle b = new Bike();
    b.display();

    Vehicle b1 = new Bus();
    b1.display();
}
}
