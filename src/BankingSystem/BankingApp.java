package BankingSystem;

import java.util.*;

public class BankingApp {
    private String name;
    private double balance;
    int Amount;

    BankingApp(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    /*
    * class SavingsAccount extends BankingApp {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void checkingAccount() {
        System.out.println("Displaying savings account balance: $" + balance);
    }

    // Add other specific methods for SavingsAccount here
}

class CheckingAccount extends BankingApp {
    CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void checkingAccount() {
        System.out.println("Displaying checking account balance: $" + balance);
    }

    // Add other specific methods for CheckingAccount here
}
*/


    void deposite(double Amount) {
        double DepositeAmount = Math.round(Amount);
        balance += DepositeAmount;
        System.out.println("Deposite Successfully ");
        System.out.println("The deposite Amount is $" + DepositeAmount + "and the total Amount is $" + balance);
    }

    void withdraw(double Amount) {
        double withdrawnAmount = Math.round(Amount);
        balance -= withdrawnAmount;
        System.out.println("Withdraw Successfully ");
        System.out.println("The withdraw amount is $" + withdrawnAmount + " and the new balance is $" + balance);
    }


        private void checkingAccount() {

        System.out.println("the total Balance  is:" + balance);
    }


    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);


        BankingApp obj = new BankingApp("Esa", 900);
        System.out.println("Name: " + obj.name);
        System.out.println("Balance: " + obj.balance);

// Choose account type
        System.out.print("Choose account type (S for Savings, C for Checking): ");
        String accountType = sc.next();

switch (accountType){
    case "S" :
    {
        System.out.println("1 for display balance \n 2 for deposit balance\n3 for withdraw balance  ");
        int input = sc.nextInt(); // Choose option
        if (input == 1) {

obj.checkingAccount();
        } else if (input == 2) {
            System.out.print("Enter Amount ");   // enter amount
            int b = sc.nextInt();
//            System.out.println(" Amount:  " + b); // display amount if you want

            obj.deposite(b);
        } else if (input == 3) {
            System.out.print("Enter Amount ");   // enter amount
            int b = sc.nextInt();
//            System.out.println(" Amount:  " + b);   // display amount if you want
            obj.withdraw(b);
        } else {
            System.out.println("else Condition");
        }
    }
    case "C"  :
    {
obj.checkingAccount();
    }
}
/*
        System.out.println("1 for display balance \n 2 for deposit balance\n3 for withdraw balance  ");
        int input = sc.nextInt(); // Choose option
        if (input == 1) {
            obj.checkingAccount(b);

        } else if (input == 2) {
            obj.deposite(b);
        } else if (input == 3) {
            obj.withdraw(b);
        } else {
            System.out.println("else Condition");
        }
        */



        /*
        * // Inside the main method
String accountType = sc.next();
BankingApp account;

switch (accountType) {
    case "S":
        account = new SavingsAccount("Esa", 900);
        break;
    case "C":
        account = new CheckingAccount("Esa", 900);
        break;
    default:
        System.out.println("Invalid account type. Exiting.");
        return;
}

account.checkingAccount(); // This will now call the appropriate overridden method
*/

    }


}



