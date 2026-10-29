import java.util.Scanner;

abstract class BankAccount {
    double balance;
    abstract void deposit(double amt);
    abstract void withdraw(double amt);

    BankAccount(double balance){
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount{

    SavingAccount(double balance){
        super(balance);
    }
    void deposit(double amt){
        balance += amt;
        System.out.println("Amount deposited in Saving Account: "+amt);
        System.out.println("Now balance is: "+balance);
    }

    void withdraw(double amt){
        balance -= amt;
        System.out.println("Amount withdrawen from Saving Account: "+amt);
        System.out.println("Now balance is: "+balance);
    }
}

class CurrentAccount extends BankAccount{

    CurrentAccount(double balance){
        super(balance);
    }
    void deposit(double amt){
        balance += amt;
        System.out.println("Amount deposited in current Account: "+amt);
        System.out.println("Now balance is: "+balance);
    }

    void withdraw(double amt){
        balance -= amt;
        System.out.println("Amount withdrawen from currrent Account: "+amt);
        System.out.println("Now balance is: "+balance);
    }
}

public class Lab_18_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter initial balance");
    double balance = sc.nextDouble();

    SavingAccount s = new SavingAccount(balance);
    System.out.println("Enter amount to deposit");
    double amt = sc.nextDouble();
      s.deposit(amt);

      System.out.println("Enter amount to withdraw");
        amt = sc.nextDouble();
      s.withdraw(amt);

    //   CurrentAccount c = new CurrentAccount(balance);

    //   System.out.println("Enter amount to deposit");
    //   c.deposit(amt);

    //   System.out.println("Enter amount to withdraw");
    //   c.withdraw(amt);
}
}
