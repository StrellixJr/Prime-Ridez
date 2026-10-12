package test.Questions.Question02;

public class SavingsAccount {
    // Instance Variables
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Creating the default Constructor
    public SavingsAccount(){

    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //Deposit method
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Enter an amount greater than 0 to deposit");
        }
        else{
            balance += amount;
            System.out.println("Deposited "+amount+". New Balance: "+balance);
        }
    }

    //Withdraw Method
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Enter an amount greater than 0 to deposit");
        }
        else if(amount>balance){
            System.out.println("Cannot withdraw an amount greater than the balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn "+amount+". New Balance: "+balance);
        }
    }

    // Display Method
    public void displayAccountDetails(){
        System.out.println("Final Account Details: ");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println();
    }
}
