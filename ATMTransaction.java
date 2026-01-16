package com.example.M4_Activity3;

public class ATMTransaction {

    public void checkBalance(String accountNumber, double balance) {
        try{
            System.out.println("Processing balance inquiry");
            int intAccNumber = Integer.parseInt(accountNumber);
            char accountType = accountNumber.charAt(0);

            switch (accountType) {
                case '1' -> System.out.println("Account Type: Savings");
                case '2' -> System.out.println("Account Type: Checking");
                default -> System.out.println("Account Type: Unknown");
            }

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Currency Balance: P" + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format! Account number must be numeric.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Account number is empty or invalid!");
        } finally {
            System.out.println("\n===RECEIPT===");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("=========");
        }
    }
}
