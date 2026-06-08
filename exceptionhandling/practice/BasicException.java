package com.exceptionhandling.practice;

public class BasicException {
    //Handled using try-catch block
    public static void main(String[]args){
        int a = 12;
        int b = 0;
        try{
            int c = a/b;
        }catch(ArithmeticException e ){
            System.out.println(e);
        }
        System.out.println("Code Executed!");
    }
}
