import java.util.Scanner;

class Payment{
    void display(){
        System.out.println("Payment System");
    }
}

class CreditCard extends Payment{
    // @Overrid
    void display(){
        System.out.println("Credit Card Payment");
    }
}

class UPI extends Payment{
    // @Overrid
    void display(){
        System.out.println("UPI Payment");
    }
}

class NetBanking extends Payment{
    // @Overrid
    void display(){
        System.out.println("Net BankingPayment");
    }
}


public class Lab_17_2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Payment p = null;

        System.out.println("Enter Payment Method");
        String paymethod= sc.next();

        if(paymethod.equalsIgnoreCase("CreditCard")){
            p = new CreditCard();
        }
        else if(paymethod.equalsIgnoreCase("UPI")){
            p = new UPI();
        }

        else if(paymethod.equalsIgnoreCase("NetBanking")){
            p = new NetBanking();
        }
        p.display();
    }
}
