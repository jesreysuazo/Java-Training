package com.example.M4_Activity6;

import com.example.M4_Activity6.exceptions.InsufficientFundsException;
import com.example.M4_Activity6.exceptions.InvalidAmountException;

@FunctionalInterface
public interface BankTestOperation {
    public void execute() throws InvalidAmountException, InsufficientFundsException;
}
