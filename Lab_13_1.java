import java.util.Scanner;

class Circle{
     
    public void area(int r){
    double area = Math.PI*r*r;
        System.out.println("Answer is: "+area);
    }
}


public class Lab_13_1 {
   
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter radius");
    int r = sc.nextInt();
    Circle c = new Circle();
    c.area(r);
    }
}
