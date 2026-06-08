package com.basics.practice;

class A{
   public int marks = 56;//as to be accessible outside and in another class and everywhere
    //the access modifier should be pulic - accessible anywhere
}

class B {
    private int age = 20;//making it rivate makes it only accessible inside the same class
}

class C extends A{
    protected int salary = 200000; //works in same package , also in sub class
}

public class AccessModifier {
    public static void main(String[] args) {
        A in = new A();
        System.out.println(in.marks);
        B ab = new B();
        //System.out.println(ab.age); - will give error as age is private
        // private can only be used inside the same class
        //public can be used anywhere
        //protected can be used in same class, same package sub class , different packages but subclass
        //default can be used in same class , same package subclass , and same package non sub class


    }
}
