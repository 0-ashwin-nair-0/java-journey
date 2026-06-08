package com.oops.practice;
//every class in java extends the object class
class A
{
    public A(){
        super();
        System.out.println("This is A");
    }


    public A(int a)
    {
        super(); //call the constructor of a super class - it will call the default one
        System.out.println("This is A in "+a);
    }
}

class B extends A {
   public B(){
       //it executes the constructor of the super or parent class
        super();
        System.out.println("This is B");
    }

    B(int a){

       this();// it will execute the constructor of the same class
        System.out.println("This is B int "+a);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        //if value is passed inside then the constructor then the extending class constructor as well as the parameterized constructor will be called
        //if it is not passed then - default constructor will be passed

        //but if A constructor is parameterized is passed then it wont be called directly.
        //on above every contructor we have a keyword super();
        //even if not mentioned still its there

        B obj = new B(5);
//When creating an object - the constructor is called directly automatically
        //Also no matter which class is being called
        //if the particular class is extending any other class then that class's consttructor will also be called
    }
}
