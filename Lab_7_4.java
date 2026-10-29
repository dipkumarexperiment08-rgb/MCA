// Write a Java program to simulate an ATM system where invalid transactions are skipped 
// using continue and the program exits on user request using break

import java.util.Scanner;

public class Lab_7_4 {
    Scanner sc = new Scanner(System.in);

    double balance;
    void deposit(double amount){
        System.err.println("Enter Amount you want to deposit");
        amount = sc.nextDouble();
        double balance += amount;
    }

    void withdraw(double amount){
        System.err.println("Enter Amount you want to deposit");
        amount = sc.nextDouble();
         balance-=amount;
    }

    void disbalance(){
        System.out.println("Your Balance is:=+balance");
    }
}
