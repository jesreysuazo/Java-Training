package com.example.M4_Activity4;

public class AccountValidator {
    public static void validateAccountNumber(String accountNumber) throws Exception{
        if(accountNumber ==  null){
            throw new NullPointerException("Cannot be null");
        }

        if(accountNumber.length() != 10){
            throw new Exception("Must be 10 digits");
        }

        System.out.println("Valid account number: " + accountNumber);

    }

    public static void main(String[] args) {
        try{
            validateAccountNumber("1234567890");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            validateAccountNumber("123");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            validateAccountNumber(null);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
