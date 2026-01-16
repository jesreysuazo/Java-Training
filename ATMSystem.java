package com.example.M4_Activity2;

public class ATMSystem {
    double[] accounts = {10000, 15000, 20000};

    public void processWithdrawal(String accountIndex, String amountInput) {
        try{
            int intAccountIndex = Integer.parseInt(accountIndex);
            double balance = accounts[intAccountIndex];
            double doubleAmountInput = Double.parseDouble(amountInput);

            System.out.println("Account= " + accountIndex + ", Amount= " + amountInput);

            System.out.println("Current balance: " + balance);
            System.out.println("Withdrawal: " + amountInput);

            if (withdrawalValidation(doubleAmountInput, balance)){
                System.out.println("Insufficient funds! Cannot withdraw P" + amountInput);
            } else {
                System.out.println("New balance: " + (balance - doubleAmountInput));
                System.out.println("Withdrawal Successful!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Account= " + accountIndex + ", Amount= " + amountInput);
            System.out.println("Invalid input");
            System.out.println("Please enter valid numbers");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Account= " + accountIndex + ", Amount= " + amountInput);
            System.out.println("Account not found");
            System.out.println("Invalid Account Index");
        } catch (Exception e) {
            System.out.println("Transaction failed");
        }
    }

    public boolean withdrawalValidation(double amount, double balance) {
        return amount > balance;

    }

}
