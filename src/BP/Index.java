package BP;
import java.util.Random;
import java.util.Scanner;

public class Index {
    public static final int CODE  = 100;
    public static final double INTEREST_RATE = 0.05;
    static{
        System.out.println("Wellcome to the Bank \n The the CODE");

    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int CODES = sc.nextInt();
            if (CODE==CODES){
                int randomInt = random.nextInt(10000);
                System.out.println("1 : transition  \n2 : Current Balance \n3 : Loan ");
                int  a =sc.nextInt();

                switch (a){
                    case 1 :{


                        System.out.println("Name: ");
                        String name = sc.next();

                        System.out.print("Number: ");
                        int number = sc.nextInt();

                        System.out.print("Hey " + name + ". What do you want to do? \n1: Transfer \n");

                        System.out.print("Current Balance: " + randomInt + "\n");

                        System.out.print("Transfer amount: ");
                        int transition = sc.nextInt();

                        if (randomInt<transition){  // for the use can not put the greater amount
                            System.out.print("Invalid Balance ");
                            break;
                        }

                        System.out.print("Type 'yes' to confirm the transfer: ");
                        String confirm = sc.next();

                        if (confirm.equals("yes")) {
                            int total = randomInt - transition;
                            System.out.println("Transaction Successful: " + transition + " has been transferred. \n Current balance is "+  total);

                        } else {
                            System.out.println("Transaction Cancelled.");
                        }
                    }
                    case 2 :{
                        System.out.println("Did you want to check the Current balance yes or no ");
                        String  Check =sc.next();

                        if (Check.equals("yes")){
                            System.out.print("Current Balance: " + randomInt + "\n");

                        } else if (Check.equals("no")){

                        }
                        break;
                    }
                    case 3:{
                      System.out.println("Welcome to the Loan Application Module");

                                System.out.print("Enter the loan amount: ");
                                double loanAmount = sc.nextDouble();

                                System.out.print("Did You pay that for a \n1: Year \n2: Month\n");
                                int choose = sc.nextInt();

                                double loanDuration = 0;
                                double monthlyInterestRate = 0;
                                String Duration;
                                switch (choose) {
                                    case 1:
                                        loanDuration = 12;
                                        Duration = "Year";

                                        monthlyInterestRate = INTEREST_RATE / 12;
                                        break;
                                    case 2:
                                        loanDuration = 30;
                                        Duration = "Month";
                                        monthlyInterestRate = INTEREST_RATE / 30;
                                        break;
                                    default:
                                        System.out.println("Invalid choice.");
                                        sc.close();
                                        return;
                                }

                                double Payment = (loanAmount * monthlyInterestRate) /
                                        (1 - Math.pow(1 + monthlyInterestRate, -loanDuration));

                                System.out.printf("Loan Amount: %.2f\n", loanAmount);
                                System.out.println("Loan Term: " + loanDuration + " " + Duration );
                                System.out.printf("Payment: %.2f\n", Payment);


                            }
                        }

                    }
            else{
                System.out.println("Invalid Code");

            }
            sc.close();
        }

}










