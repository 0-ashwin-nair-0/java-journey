package com.oops.practice;

public class BankConstructor {
    String accountHolderName;
    int accountNo;
    double balance;

    BankConstructor(String accountHolderName, int accountNo, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(double amount){
        System.out.println("Amount: "+amount+" deposited!");
        double finalAmt = amount + balance;
        System.out.println("Total Balance = "+finalAmt);
    }
    void withdraw(double amount){
        System.out.println("Amount: "+amount+" withdrawn!");
        double finalAmt = balance - amount;
        System.out.println("Total Balance: "+finalAmt);
    }
}
