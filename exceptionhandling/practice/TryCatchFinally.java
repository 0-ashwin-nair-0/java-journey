package com.exceptionhandling.practice;

public class TryCatchFinally {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c = 0;
        try{
            c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("Operation closed!!");
            if(c>0){
                System.out.println("Success");
            }
            else {
                System.out.println("Failed");
            }
        }
        

    }
}