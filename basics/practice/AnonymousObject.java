package com.basics.practice;

class Show{
    public void show(){
        System.out.println("This is it");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new Show().show(); //Anonymous object - not stored in stack

    }
}
