public class SavingAccount extends BankAccount{
    private double interestRate;

//    Constructor
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = 5.5d;
    }
//Constructor To fetch data from BankAccount
    public SavingAccount(BankAccount account) {
        super(account);
        this.interestRate = 5.5d;
    }

//    Method to Apply Interest Rates
    public void applyInterestRate(){
        System.out.println("Our Bank provides 5.5% Interest Rates On Your Saving Account  \n");
        double interest = balance * (interestRate/100);
        balance += interest;
        System.out.println("Applied Interest: " + interest);
        System.out.println("Your Current Balance After Adding Interest is: " + balance+"\n");
    }
}
