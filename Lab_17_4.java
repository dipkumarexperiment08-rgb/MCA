import java.util.Scanner;

class  Hospital{
    void display(){
        System.out.println("City Hospital");
    }
}

class Department extends Hospital{
    String DepartmentName;

    Department(String DepartmentName){
        this.DepartmentName = DepartmentName;
    }
    void display(){
        System.out.println("Department"+DepartmentName);
    }
}
public class Lab_17_4 {
    public static void main(String[] args) {
        String DepartmentName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department Name");
        DepartmentName = sc.next();

        Department D1 = new Department(DepartmentName);

        D1.display();

    }
}
