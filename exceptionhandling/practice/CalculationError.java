package com.exceptionhandling.practice;

import java.lang.reflect.Array;

public class CalculationError {
    public static void main(String[] args) {
        int nums[] = new int[5];
        int a = 18;
        int b = 2;
//we can have multiple catch block
        try{
            int result = a/b;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Something went wrong "+e);
        }catch (ArrayIndexOutOfBoundsException j){
            System.out.println("Stay in your limit "+j);
        }
        System.out.println("Code worked");
    }
}//we can write mulitple  try blocks
