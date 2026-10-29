interface Device{
    public void powerOn();
}

interface SmartDevice extends Device{
    public void connectInternet();
}
class SmartPhone implements Device , SmartDevice{
    public void powerOn(){
        System.out.println("Device is Powered on");
    }

    public void connectInternet(){
        System.err.println("Device is connected to internet");
    }
}

public class Lab_21_3 {
    public static void main(String[] args) {
        SmartDevice sd = new SmartPhone();
        sd.powerOn();
        sd.connectInternet();        
    }
}
