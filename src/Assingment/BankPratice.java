package Assingment;

import java.util.Scanner;


// Main class
class BankingApp {
    protected String name;
    protected double balance;

    BankingApp(String name, double balance) {
        this.name = name;
        this.balance = balance;
        displayBalance();   // For print Customer name and Balance
    }

    // Deposit methode
    void deposit(double amount) {
        double depositedAmount = Math.round(amount);
        balance += depositedAmount;
        System.out.println("Deposit Successful");
        System.out.println("The deposited amount is $" + depositedAmount + " and the total amount is $" + balance);
    }

    // withdraw methode
    void withdraw(double amount) {
        double withdrawnAmount = Math.round(amount);
        balance -= withdrawnAmount;
        System.out.println("Withdraw Successful");
        System.out.println("The withdrawn amount is $" + withdrawnAmount + " and the new balance is $" + balance);
    }

    public void displayBalance() {
        System.out.println("Account holder: " + name);
        System.out.println("Balance: $" + balance);
    }

    // Polymorphic method
    void checkingAccount() {
        System.out.println("Displaying account balance: $" + balance);
    }
}

class SavingsAccount extends BankingApp {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void checkingAccount() {
        System.out.println("Displaying savings account balance: $" + balance);
    }

}

class CheckingAccount extends BankingApp {
    CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void checkingAccount() {


        System.out.println("Displaying checking account balance: $" + balance);
    }

}

public class BankPratice {

    public static void main(String[] args) {

//        displayBalance();
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose account type (S for Savings, C for Checking ): ");
        String accountType = sc.next();
// Object Initialized
        BankingApp obj;

        switch (accountType) {
            case "S":
            case "s":
                obj = new SavingsAccount("Zeeshan", 900);

                break;
            case "C":
            case "c":
                obj = new CheckingAccount("Ali ", 500);
                break;
            default:
                System.out.println("Invalid account type. Exiting.");
                return;
        }
        // Select the Option to perform
        System.out.println("1 : display balance \n2 : deposit balance\n3 : withdraw balance");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                obj.checkingAccount();
                break;
            case 2:
                System.out.print("Enter Amount: ");
                int depositAmount = sc.nextInt();
                obj.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter Amount: ");
                int withdrawAmount = sc.nextInt();
                obj.withdraw(withdrawAmount);
                break;
            default:
                System.out.println("Invalid input. Exiting.");
        }
    }
}


