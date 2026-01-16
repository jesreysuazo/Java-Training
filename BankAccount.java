package com.example.M4_Activity1;

public class BankAccount {



    public static String getAccountName(String AccNumber) {
        switch (AccNumber) {
            case "ACC-001" -> {
                return "Juan Dela Cruz";
            }
            case "ACC-002" -> {
                return "MariaSantos";
            }
            default -> {
                return null;
            }
        }
    }

    public static void testCase(String AccNumber) {
        try {
            System.out.println("\nLooking up account: " + AccNumber);
            System.out.println(getAccountName(AccNumber).toUpperCase());

        } catch (NullPointerException e) {
            System.out.println("Error: Account not found!");
        }
    }
}
