package com.example.M4_Activity1;

public class Application {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("=== Bank Account Name Display ===");

        bankAccount.testCase("ACC-001");
        bankAccount.testCase("ACC-999");

        System.out.println("\n=== Program completed successfully! ===");
    }

}
