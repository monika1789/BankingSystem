import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Input for all the required variables
        Scanner scanner = new Scanner(System.in);
        String accountNumber = "";
        String accountHolderName = "";
        double balance = 0.0;

        boolean validInput = true;

    while(validInput) {
        try {
            System.out.println("Enter Account number: ");
            accountNumber = scanner.nextLine();

            System.out.println("Enter Account Holder Name: ");
            accountHolderName = scanner.nextLine();

            System.out.println("Enter Balance: ");
            balance = scanner.nextDouble();
            scanner.nextLine();

            validInput = false;
            System.out.println("Thanks for your Information.\n");

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid input");
            scanner.nextLine();
        }
    }

        BankAccount bankAccount = new BankAccount(accountNumber , accountHolderName,balance);
        SavingAccount savingAccount = new SavingAccount(bankAccount);


        boolean running = true;

//        Switch checking for the case and applying the method accordingly

        while(running) {

            System.out.println("************************************");
            System.out.println("*     Welcome to the Bank          *");
            System.out.println("************************************");
            System.out.println("What would you like to do today?");
            System.out.println("-> Withdraw");
            System.out.println("-> Deposit");
            System.out.println("-> Check Balance");
            System.out.println("-> Account Details");
            System.out.println("-> Interest");
            System.out.println("-> Type 'q' to quit");
            System.out.println("************************************");

            String response = scanner.nextLine();

            switch (response.toLowerCase()) {

                case "withdraw":
                    System.out.println("Enter the Amount you want to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.withdrawal(withdrawalAmount);
                    break;

                case "deposit":
                    System.out.println("Enter the Amount you want to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.deposit(depositAmount);
                    break;

                case "check balance":
                    bankAccount.checkBalance();
                    break;

                case "account details":
                    bankAccount.accountDetails();
                    break;

                case "interest":
                    savingAccount.applyInterestRate();
                    break;

                case "q":
                    System.out.println("Thank you for Banking With Us.");
                    running = false;
                    break;

                default:
                    System.out.println("Please select from the above category.");
                    break;
            }
// Statement to check if the User wants to perform another operation
            if (running){
                System.out.println("Do you want to perform another operation? (yes to continue, no to quit)\n");
                String continueResponse = scanner.nextLine();

                if (continueResponse.equalsIgnoreCase("no")){
                    System.out.println("Thank you for Banking with us!!");
                    running = false;
                }
            }
        }
        scanner.close();
    }
}