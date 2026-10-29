class Payment {
    void processPayment() {
        System.out.println("Payment");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Credit Card Payment");
    }
}

class UPI extends Payment {
    void processPayment() {
        System.out.println("UPI Payment");
    }
}

class NetBanking extends Payment {
    void processPayment() {
        System.out.println("Net Banking Payment");
    }
}

public class temp {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.processPayment();

        p = new UPI();
        p.processPayment();

        p = new NetBanking();
        p.processPayment();
    }
}