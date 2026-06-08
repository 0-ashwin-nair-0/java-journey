package com.oops.practice;
//lambda will only work with functional interface
interface Add{
    int add(int a, int b);
}
public class LambdaWithReturn {
    public static void main(String[] args) {

        Add obj = (a,b) -> a+b; //lambda expression and no need of return keyword here
        //as there is just one command - no need of curly braces
        int result = obj.add(4,5);
        System.out.println(result);

//        Add ad = new Add() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//
//        System.out.println(ad.add(3,4));


    }

}
