import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Person{
    String Name;

    Person(String Name){
        this.Name =Name;
    }

    void display(){
        System.out.println("Student Name: "+Name);
    }
}

class Student extends Person{
    int rollno;
    Student(String Name , int rollno){
        super(Name);
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name: "+super.Name);
        System.out.println("Roll No: "+rollno);
    }

} 

public class Lab_17_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Name");
        String Name=sc.next();

        System.out.println("Enter RollNo");
        int rollno = sc.nextInt();
        Student s1 = new Student(Name , rollno);

        s1.display();
    }
}
