class Student{
    static int count =0;

    public Student() {
        count++;
    }   
}


public class Lab_14_2 {
    public static void main(String[] args) {
     Student s1= new Student();
     Student s2= new Student();
     Student s3 = new Student();
     
      System.out.println("Number of objects created: " + Student.count);
}
}