import java.util.Scanner;

public class Lab_8_2 {
    
void leapyear(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year");
    int year = sc.nextInt();
    if(year%400==0 || (year%100!=0 && year%4==0)){
        // year = 0;
        System.out.println("Leap Year");
    }
    else{
        // year = 1;
        System.out.println("Not Leap Year");
    }
}   
    public static void main(String[] args) {
        
        Lab_8_2 ab = new Lab_8_2();
        ab.leapyear(); 
    }
}
