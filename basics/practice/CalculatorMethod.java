package com.basics.practice;
//this is the concept of method overloading

class CalculatorBrain{
    public int add(int num1 , int num2){
        return num1+ num2;
    }//same method name but different parameters
    //even the datatype of the parameter can be different
    public int add(int num1 , int num2 , int num3){
        return num1+num2+num3;
    }
    public double add(double num1, int num2){
        return num1+num2;
    }
}
public class CalculatorMethod {
    public static void main(String[] args) {
        CalculatorBrain cb = new CalculatorBrain();
        //reference variable - cb
        double result = cb.add(1,2,3);
        System.out.println(result);
    }
}