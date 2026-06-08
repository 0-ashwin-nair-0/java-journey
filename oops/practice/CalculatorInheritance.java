package com.oops.practice;

class Calculator
{
    public int add( int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1 , int n2){
        return n1-n2;
    }
}
// multilevel inheritance
//one class inherits and another class inherits the other class
class AdvanceCalculator extends Calculator{
    public int multi(int a, int b){
        return a * b;
    }
    public int div(int a , int b){
        return a / b;
    }
}

class VeryAdvCalc extends AdvanceCalculator{
    public double power(double a , double b){
        return StrictMath.pow(a,b);
    }

}

public class CalculatorInheritance extends AdvanceCalculator{
    public static void main(String[] args) {

        VeryAdvCalc ad = new VeryAdvCalc();
        System.out.println(ad.add(3,2));
        System.out.println(ad.sub(3,2));
        System.out.println(ad.div(10,2));
        System.out.println(ad.multi(2,3));
        System.out.println(ad.power(3,4));
    }

}
