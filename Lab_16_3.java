import java.util.*;
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int stdid;

    Student(String name , int age , int stdid){
        super(name, age);
        this.stdid = stdid;
    }
    public void displayStudent(){
        displayPerson();
        System.out.println("Student Id: "+stdid);
        }
}

class Faculty extends Person {
    int salary;

    Faculty(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayFaculty() {
        displayPerson();
        System.out.println("Faculty salary is:" + salary);
    }
}

public class Lab_16_3 {
        public static void main(String[] args) {
            Student s1 = new Student("Deep" , 21 , 101);

            Faculty f1 = new  Faculty("Deep", 25, 500000);

            // Person P1 = new  Person("Deep", 101);

            s1.displayStudent();
            f1.displayFaculty();

            
        }}

