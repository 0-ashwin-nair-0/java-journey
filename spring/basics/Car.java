package com.spring.basics;

public class Car {
    private Engine e;
    Car(Engine e){
        this.e=e;
    }
    void drive(){
        e.start();
    }
}
