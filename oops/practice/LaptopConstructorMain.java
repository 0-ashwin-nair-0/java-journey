package com.oops.practice;

public class LaptopConstructorMain {
    public static void main(String[] args) {
        LaptopConstructor l1 = new LaptopConstructor("HP", 95000);
        LaptopConstructor l2 = new LaptopConstructor("Lenovo", 50000);

        l1.start();
        l2.start();
    }
}
