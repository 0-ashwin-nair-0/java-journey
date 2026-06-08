package com.oops.practice;
//Poly - many
//Morphism - behaviour or forms
//2 types of polymorphism
//Runtime Polymorphism - if the behaviour is defined at run time
//Compile Time Morphism - if the behaviour is defined at compile time

//Method overloading - add(int a , int b ) | add(int a , int b , int c) - which one is to be executed is decided at compile time

//Method overriding - if 2 classes and one extends other and both of them uses same method name
//same parameters but implementation differs  - out of both which one will be executed will be at runtime

// A obj = new B();
//here the A obj where the type of obj is A and the implementation is B



class R{//Computer
     public void show(){
         System.out.println("This is R ");
     }
}

class O extends R{//Laptop
    @Override
    public void show(){
        System.out.println("This is O");
    }
}

class  Q extends R{
    @Override
    public void show(){

        System.out.println("This is Q");
    }
}
public class PolymorphismMain {
    public static void main(String[] args) {
        //upcasting
        R obj = new O();// Only methods declared in R are accessible through obj.
// If those methods are overridden in O, O's version executes at runtime.
        R obj2 = new Q();
        obj.show();
        obj2.show();


    }

}
//What if O has more methods?
//
//Example:
//
//class R {
//    public void show() {
//        System.out.println("R");
//    }
//}
//
//class O extends R {
//    @Override
//    public void show() {
//        System.out.println("O");
//    }
//
//    public void laptopMethod() {
//        System.out.println("Laptop Method");
//    }
//}
//
//Now:
//
//R obj = new O();
//
//obj.show();          // ✅ Allowed
//obj.laptopMethod();  // ❌ Compile Error
//
//Why?
//
//Because Java looks at the reference type (R) while checking accessible methods.
//
//R does not contain laptopMethod().