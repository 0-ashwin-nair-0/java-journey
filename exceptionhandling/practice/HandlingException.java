package com.exceptionhandling.practice;
//if we want to manually throw an exception - in a place where the program wont give
//we can use throw
//throw actually creates and throws an exception object
public class HandlingException {
    public static void main(String[] args) {
        int value = 0;
        int result =0;
        try{
            result = 18/value;

            if(result == 9){
                throw new ArithmeticException("Result should not be 9");
            }
//throw is used to throw an exception
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
