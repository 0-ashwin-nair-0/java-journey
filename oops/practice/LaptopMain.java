package com.oops.practice;

public class LaptopMain {
    public static void main(String[] args) {
        //creating objects - this helps to reduce reusablility and make the code look clean
        Laptop l1 = new Laptop();
        l1.brand ="HP";
        l1.ram = 12;
        l1.price = 540000;
        Laptop l2 = new Laptop();//object creation
        l2.brand = "Lenovo";
        l2.ram = 36;
        l2.price=85000;

        l1.start();
        l2.start();
        l1.shutdown();
        l2.shutdown();
    }
}
