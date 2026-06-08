package com.oops.practice;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.accountHolderName = "Ashwin Reji Kumar Nair";
        ba1.accountNo = 8291234567L;
        ba1.branch = "Pune";
         BankAccount ba2 = new BankAccount();
         ba2.accountHolderName = "Kinjal Suryakant Surve";
         ba2.accountNo = 1234567891L;
         ba2.branch = "Mumbai";

         ba1.deposit(500, 1234567891L);
         ba2.withdraw(400, 8291234567L);
    }
}
