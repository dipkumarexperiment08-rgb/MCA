import java.util.Scanner;

public class Lab_11_1 {
   
    public static void main(String[] args) {
        String n;
        int r;
        double s;
        String c;
        Student s1 = new Student();
        for(int i=1; i<=3; i++){
              Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        n = sc.next();
        System.out.println("Enter Roll_No:");
        r = sc.nextInt();
        System.out.println("Enter SPI:");
        s = sc.nextDouble();
        System.out.println("Enter Course:");
        c = sc.next();
            s1.getter(n , r , s , c);
            s1.setter();

        }
    }
    
}
 class Student{
    String name;
    int roll_no;
    double spi;
    String course;
    void getter(String n, int r , double s , String c){
        name = n;
        roll_no = r;
        spi = s;
        course = c;
       
    }
    void setter(){
        System.out.println("Name:"+name);
        System.out.println("Roll_No:"+roll_no);
        System.out.println("spi"+spi);
        System.out.println("course:"+course);
    }
    }