import java.util.Random;
import java.util.Scanner;

public class MCABank {

    static String bankName = "MCA Bank";
    static int accountCount = 0;
    static Scanner sc = new Scanner(System.in);

    int accountNo;
    String name;
    double balance;

    MCABank() {
        this.accountNo = generateAccountNo();
        this.name = "Unknown";
        this.balance = 0;
        accountCount++;
    }

    MCABank(String name) {
        this.accountNo = generateAccountNo();
        this.name = name;
        this.balance = 0;
        accountCount++;
    }

    MCABank(String name, double balance) {
        this.accountNo = generateAccountNo();
        this.name = name;
        this.balance = balance;
        accountCount++;
    }

    MCABank(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        accountCount++;
    }

    MCABank(MCABank account) {
        this.accountNo = generateAccountNo();
        this.name = account.name;
        this.balance = account.balance;
        accountCount++;
    }

    static int generateAccountNo() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    static void displayAccountCount() {
        System.out.println("Total Accounts: " + accountCount);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) {
        String result = amount <= balance
                ? "Withdrawal Successful"
                : "Insufficient Balance";

        if (amount <= balance) {
            balance -= amount;
        }

        System.out.println(result);
        System.out.println("Balance: " + balance);
    }

    void displayAccount() {
        System.out.println("----------------------------");
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }

    void checkBalance() {
        String status = balance >= 1000
                ? "Minimum Balance Maintained"
                : "Low Balance";

        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Status: " + status);
    }

    void accountDetails() {
        System.out.println("----------------------------");
        System.out.println("Account Details");
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }

    static void bankRules() {
        double minimumBalance = 1000;

        System.out.println("----------------------------");
        System.out.println("Bank Rules");
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Deposit Facility Available");
        System.out.println("Withdrawal Facility Available");
        System.out.println("----------------------------");
    }

    static void nestedClassExample() {
        System.out.println("Nested Class Concept");
        System.out.println("AccountDetails is represented as a nested concept.");
    }

    static void staticNestedClassExample() {
        System.out.println("Static Nested Class Concept");
        System.out.println("BankRules is represented as a static nested concept.");
    }

    static int findAccount(MCABank[] accounts, int accountNo) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null &&
                accounts[i].accountNo == accountNo) {
                return i;
            }
        }

        return -1;
    }

    static void showMenu() {
        System.out.println();
        System.out.println("========== MCA BANK ==========");
        System.out.println("1. Create Account");
        System.out.println("2. Display Accounts");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Check Balance");
        System.out.println("6. Account Details");
        System.out.println("7. Bank Rules");
        System.out.println("8. Bank Information");
        System.out.println("9. Nested Class");
        System.out.println("10. Static Nested Class");
        System.out.println("11. Copy Account");
        System.out.println("12. Exit");
        System.out.print("Enter Choice: ");
    }

    public static void main(String[] args) {

        MCABank[] accounts = new MCABank[10];

        accounts[0] = new MCABank();
        accounts[1] = new MCABank("Rahul");
        accounts[2] = new MCABank("Amit", 5000);

        int count = 3;

        while (true) {

            showMenu();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < accounts.length) {

                        sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        accounts[count] = new MCABank(name, balance);

                        System.out.println();
                        System.out.println("Account Created Successfully");
                        System.out.println(
                                "Account Number: " +
                                accounts[count].accountNo
                        );

                        count++;

                    } else {
                        System.out.println("Account Limit Reached");
                    }

                    break;

                case 2:

                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) {
                            accounts[i].displayAccount();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    int depositAccount = sc.nextInt();

                    int depositIndex =
                            findAccount(accounts, depositAccount);

                    if (depositIndex != -1) {

                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();

                        accounts[depositIndex].deposit(amount);

                    } else {

                        System.out.println("Account Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    int withdrawAccount = sc.nextInt();

                    int withdrawIndex =
                            findAccount(accounts, withdrawAccount);

                    if (withdrawIndex != -1) {

                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();

                        accounts[withdrawIndex].withdraw(amount);

                    } else {

                        System.out.println("Account Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Account Number: ");
                    int balanceAccount = sc.nextInt();

                    int balanceIndex =
                            findAccount(accounts, balanceAccount);

                    if (balanceIndex != -1) {

                        accounts[balanceIndex].checkBalance();

                    } else {

                        System.out.println("Account Not Found");
                    }

                    break;

                case 6:

                    System.out.print("Enter Account Number: ");
                    int detailsAccount = sc.nextInt();

                    int detailsIndex =
                            findAccount(accounts, detailsAccount);

                    if (detailsIndex != -1) {

                        accounts[detailsIndex].accountDetails();

                    } else {

                        System.out.println("Account Not Found");
                    }

                    break;

                case 7:

                    bankRules();

                    break;

                case 8:

                    displayBankName();
                    displayAccountCount();

                    break;

                case 9:

                    nestedClassExample();

                    break;

                case 10:

                    staticNestedClassExample();

                    break;

                case 11:

                    System.out.print("Enter Account Number: ");
                    int copyAccount = sc.nextInt();

                    int copyIndex =
                            findAccount(accounts, copyAccount);

                    if (copyIndex != -1 && count < accounts.length) {

                        accounts[count] =
                                new MCABank(accounts[copyIndex]);

                        System.out.println();
                        System.out.println("Account Copied Successfully");
                        System.out.println(
                                "New Account Number: " +
                                accounts[count].accountNo
                        );

                        count++;

                    } else {

                        System.out.println("Account Not Found");
                    }

                    break;

                case 12:

                    System.out.println("Thank You for Banking With MCA Bank");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}