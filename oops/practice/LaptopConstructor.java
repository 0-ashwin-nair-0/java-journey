package com.oops.practice;
//Using constructor
public class LaptopConstructor {
    String brand;
    int price;

    LaptopConstructor(String b, int p){
        brand = b;
        price = p;
    }

    void start(){
        System.out.println(brand+ " Laptop Started!");
    }

}
