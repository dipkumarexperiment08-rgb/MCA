abstract class Vehicle{
    void StartEngine(){};
    void StopEngine(){};
}


class Car extends Vehicle{
    void StartEngine(){
        System.out.println("Car engine started");
    }

    void StopEngine(){
        System.out.println("Car engine stopped");
    }
}

class MotorCycle{
    void StartEngine(){
        System.out.println("Motorcycle engine started");
    }

    void StopEngine(){
        System.out.println("Motorcycle engine stopped");
    }
}

public class Lab_18_3 {
    public static void main(String[] args) {
    Car c = new Car();
    c.StartEngine();
    c.StopEngine();

    MotorCycle m = new MotorCycle();
    m.StartEngine();
    m.StopEngine();
    }

}
