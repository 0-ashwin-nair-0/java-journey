package com.oops.practice;
//Enumeration - Enums for short
//we cant extend enum with any other class
enum Status{
    //status is a class and all the below are objects
    Running, Failed, Pending, Success; //these are named constants
}
public class EnumsJava {
    public static void main(String[] args) {
        Status st = Status.Running;//values() - will print all the values of the object

        System.out.println();
        if(st == Status.Running){
            System.out.println("All Good!");
        }
        else if(st == Status.Failed){
            System.out.println("Please Try Again");
        }
        else if(st == Status.Pending){
            System.out.println("Please Wait");
        }
        else if(st == Status.Success){
            System.out.println("Great! Success");
        }
        else{
            System.out.println("Error");
        }
        //same can be done with switch

    } //st.ordinal gets the value of the object eg - running - 0
    //it starts from 0 and goes till the number of objects there
}
