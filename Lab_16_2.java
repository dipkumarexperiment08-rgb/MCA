import java.util.Scanner;

class Employee{
    // int salary = 5000000;
    void work(){
        System.out.println("Employee is working");
    }

    void getSalary(){
        System.out.println("Employee salary is: 50000");
    }
}



class Hrmanager extends  Employee{
    @Override
    void work(){
        System.out.println("Hrmanager is working");
    }

    void addEmployee(){
        System.out.println("Hrmanager added employees");
    }
}
public class Lab_16_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        Hrmanager h1 = new Hrmanager();

        h1.getSalary();
        h1.work();
        h1.addEmployee();;
    }
}
