package test.Questions.Question02;

import java.util.Scanner; // Importing the Scanner Class

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating the Scanner object
        SavingsAccount account  = new SavingsAccount(); // Creating the object from the class

        System.out.print("Enter Account Number: "); // Getting input for Account Number
        int accountNumber = input.nextInt();
        account.setAccountNumber(accountNumber);
        input.nextLine();

        System.out.print("Enter Account Holder Name: "); // Getting input for Account Holder Name
        String accountHolderName = input.nextLine();
        account.setAccountHolderName(accountHolderName);

        System.out.print("Enter Initial Deposit: "); // Getting input for Initial Deposit
        double initialDeposit = input.nextDouble();
        account.deposit(initialDeposit);

        System.out.print("Enter Deposit Amount: "); // Getting input for Deposit Amount
        double deposit = input.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdraw Amount: "); // Getting input for Withdraw Amount
        double withdraw = input.nextDouble();
        account.withdraw(withdraw);

        System.out.println();
        account.displayAccountDetails(); // Displaying the account Details

        input.close(); // Closing the Scanner Class
    }
}
