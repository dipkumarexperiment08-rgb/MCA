import java.util.Scanner;

class Book{
    private String author_name;

    Book(String author){
        author_name = author;
    }
    void display(){
        System.out.println("Author Name: "+author_name);
    }
}

class BookPublication extends Book{
    private String title;
    BookPublication(String author , String title){
        super(author);
        this.title = title;
    }

    void display(){
        super.display();
        System.out.println("Book Publication"+this.title);
    }
}

    class PaperPublication extends Book{
        private String title;
        PaperPublication(String author, String title){
            super(author);
            this.title = title;
        }

        void display(){
            super.display();
            System.out.println("Paper Publication"+this.title);
        }
    }

public class Lab_17_3 {
    public static void main(String[] args) {
        Book b = new BookPublication("Deep", "Java");
        Book b2 = new BookPublication("Deep", "c++");

        b.display();
        


    }
}
