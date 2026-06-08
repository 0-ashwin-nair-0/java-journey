package com.oops.practice;
//by default java.lang - by default import - * if added then all the files will be imported
class J{
    public int add(int a , int  b){
        System.out.println("inside the A show");
        return a + b;
    }
}

class P extends J{

public int add(int a , int b) {
    return a + b +1;//method overriding
}}


public class MethodOverriding {

    public static void main(String[] args) {

        P pp = new P();
       int result =  pp.add(2,3);
        System.out.println(result);
    }
}
