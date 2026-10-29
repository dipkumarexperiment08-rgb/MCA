class Library{
    void membership(){
        System.err.println("Library Management System");
    }
}

class StudentMember extends Library{
    @Override
    void membership(){
        System.out.println("Student can be issued 2 books");
    }
}

class FacultyMember extends Library{
    @Override
    void membership(){
        System.out.println("Faculty can be issued 5 books");
    }
}

class ResearchMember extends Library{
    @Override
    void membership(){
        System.out.println("Researcher can issue 10 books");
    }
}



public class Lab_19_4 {
 public static void main(String[] args) {
     Library l1 = new StudentMember();
     l1.membership();
     Library l2 = new FacultyMember();
     l2.membership();
     Library l3 = new ResearchMember();
     l3.membership();
 }
}
