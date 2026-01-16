package com.example.M4_Activity2;

public class Application {
    public static void main(String[] args) {
        ATMSystem atmSystem = new ATMSystem();
        System.out.println("---Test 1: Valid Withdrawal---");
        atmSystem.processWithdrawal("1","5000");

        System.out.println("\n---Test 2: invalid account index---");
        atmSystem.processWithdrawal("abc","5000");

        System.out.println("\n---Test 3: account not found---");
        atmSystem.processWithdrawal("10","5000");

        System.out.println("\n---Test 4: insufficient funds ---");
        atmSystem.processWithdrawal("1","20000");

        System.out.println("=== All test complete ===");
    }
}
