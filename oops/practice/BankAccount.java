package com.oops.practice;
//object creation and accessing
public class BankAccount {

    String accountHolderName;
    long accountNo;
    String branch;

    void deposit(double money, long accountNo){
        System.out.println(money+ " deposited to bank account "+accountNo);
    }

    void withdraw(double money, long accountNo){
        System.out.println("Amount: "+money+" withdrawn from bank account "+accountNo);
    }
}
