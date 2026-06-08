package com.spring.basics;

public class MainCar {
    public static void main(String[] args) {
    Engine e = new PetrolEngine();
    Car c = new Car(e);
    c.drive();
}}
