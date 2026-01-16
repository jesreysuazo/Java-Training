package com.example.M4_Activity3;

public class Application {
    public static void main(String[] args) {
        ATMTransaction atmTransaction = new ATMTransaction();
        System.out.println("\n--- Test Case 1: Valid Savings Account ---");
        atmTransaction.checkBalance("100123456",15000.00);

        System.out.println("\n--- Test Case 2: Valid Checking Account ---");
        atmTransaction.checkBalance("200987654",25000.00);

        System.out.println("\n--- Test Case 3: Invalid Account Number Format ---");
        atmTransaction.checkBalance("ABC12345",15000.00);

        System.out.println("\n--- Test Case 4: Empty Account Number ---");
        atmTransaction.checkBalance("",15000.00);
    }
}
