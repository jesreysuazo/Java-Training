package com.example.M4_Activity6;

import com.example.M4_Activity6.exceptions.InsufficientFundsException;
import com.example.M4_Activity6.exceptions.InvalidAmountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance = 10000.00;

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
        logger.info("INFO: Withdraw requested" + amount);

        if(amount < 0) {
            logger.error("ERROR: ", new InvalidAmountException("Invalid amount input: " + amount));
        } else if (amount > balance){
            logger.warn("WARN: ", new InsufficientFundsException("Insufficient funds: " + balance + " available"));
        }

        balance -= amount;

        logger.info("INFO: Withdrawal completed: P" + amount + " , New balance: " + balance);

    }

    public void deposit(double amount) throws InvalidAmountException{
        logger.info("INFO: Deposit requested: " + amount);

        if(amount < 0) {
            logger.error("ERROR: ", new InvalidAmountException("Invalid amount input: " + amount));
        } else if (amount > 50000){
            logger.warn("WARN: Depositing amount higher than P50000");
        }

        balance += amount;

    }

    public void runTest(BankTestOperation operation, String operationName){
        try{
            operation.execute();
        } catch (InvalidAmountException e){
            logger.error("InvalidAmountException during: " + operationName + ": " + e.getMessage());
        } catch (InsufficientFundsException e){
            logger.error("InsufficientFundsException during: " + operationName + ": " + e.getMessage());
        }
    }

}
