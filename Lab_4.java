class Account {
    int accountNo = 101;
    double balance = 50000;

    void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interest = 7.5;
}

class LoanAccount extends SavingsAccount {
    double loanAmount = 200000;

    void displayLoan() {
        displayAccount();
        System.out.println("Interest: " + interest + "%");
        System.out.println("Loan Amount: " + loanAmount);
    }
}
public class Lab_4 {
    public static void main(String[] args) {
        LoanAccount l = new LoanAccount();
        l.displayLoan();
    }
}
