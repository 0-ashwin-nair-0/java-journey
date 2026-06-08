package com.oops.practice;

public class BankConstructorMain {
    public static void main(String[] args) {
        BankConstructor bc1 = new BankConstructor("Ashwin Nair", 2033434343, 50000);
        BankConstructor bc2 = new BankConstructor("Kinjal Surve", 33939390, 30000);
        bc1.deposit(3000);
        bc2.withdraw(5000);
    }
}
