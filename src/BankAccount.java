public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

//    Getter and Setter for private variables
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

// Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

//   Constructor to Fetch data from Class BankAccount
    public BankAccount(BankAccount account) {
        this.accountNumber = account.accountNumber;
        this.accountHolderName = account.accountHolderName;
        this.balance = account.balance;
    }

//    Method for Account Details
    public void accountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance In the Account: "+ balance+"\n");
    }

//    Method To deposit Amount
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Thank You for Banking with us.\n" + depositAmount + " is deposited into your account");
            System.out.println("Remaining Balance in you Account is: "+ balance+"\n");
        } else {
            System.out.println("Please add accurate amount");
        }
    }

//Method To Withdraw amount
    public void withdrawal(double withdrawalAmount){
            if (withdrawalAmount > 0 && withdrawalAmount <= balance){
               balance -= withdrawalAmount;
                System.out.println( withdrawalAmount+ " is withdrawal from Your account");
                System.out.println("Remaining Balance in you Account is: "+ balance+"\n");
            }
        }
//Method To check Balance
    public void checkBalance(){
        System.out.println("Your current balance is "+ balance+"\n");
    }

}

