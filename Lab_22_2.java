class InsufficientFundException extends Exception {
    InsufficientFundException(String message) {
        super(message);
    }
}

class Account {
    double balance = 10000;
    double minimumBalance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < minimumBalance) {
            throw new InsufficientFundException("Insufficient Fund Minimum balance must be 1000.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Lab_22_2 {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(5000);

        try {
            a.withdraw(15000);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + a.balance);
    }
}