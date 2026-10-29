import java.util.Scanner;

public class Lab_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
    String Job_title;
    int salary;
        System.out.println("Enter Name of the Employee");
        name=sc.next();
         System.out.println("Enter Job title  of the Employee");
        name=sc.next();
         System.out.println("Enter Salary of the Employee");
        salary=sc.nextInt();

        
    
    }
}

class Employee{
    String name;
    String Job_title;
    int salary;

    void calSalary(){
        double AnualSalary=salary*12;
        System.out.print("Your Anual Salary is:"+AnualSalary);
    }
    void UpdateSalary(){
        double updatesalary= salary*0.20;
        System.out.println("Updated Salary is:"+updatesalary);
    }
}
