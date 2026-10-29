import java.util.Scanner;

public class Lab_11_2 {
    public static void main(String[] args) {
        Cube c1 = new Cube();
        for(int -=1;i<=2;i++){
                Scanner sc = new Scanner(System.in);
            System.out.println("Enter Height");
            height = sc.nextDouble();
                System.out.println("Enter Width");
            width = sc.nextDouble();
              System.out.println("Enter Depth");
            depth = sc.nextDouble();
            C1.getter();
            c1.setter();

            
        }
    }

}

class Cube{
    double height;
    double width;
    double depth;

    void getter(double h , double w, double d){
        height = h;
        width = w;
        depth =d;
    }

     void volume(double h , double w , double d){
        double result = h*w*d;
    }
    
    void setter(){
        System.out.println("Height:"+height);
        System.out.println("Height:"+height);
        System.out.println("Depth:"+depth);
        System.out.println("Result:"+result);
    }

   
}
