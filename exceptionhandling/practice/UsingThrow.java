package com.exceptionhandling.practice;

public class UsingThrow {
    public void check(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Not Eligible");
        }
        else{
            System.out.println("Allowed!!");
        }
    }

    public void doublecheck(int salary){
        try{
            if(salary > 1000000){
                throw new IllegalArgumentException("You are not eligible for the scheme");
            }
            else{
                System.out.println("You are eligible");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        UsingThrow ut = new UsingThrow();
        try {
            ut.check(10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        ut.doublecheck(10000);
    }
}
