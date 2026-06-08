package com.oops.practice;
//It is called functional or SAM (Single Abstract Method) as we have only one method
//To restrict anyone to add more methods which will then non functional or else a normal interface
//we can use an annotation that is
@java.lang.FunctionalInterface
interface AA{
    void show();
}

class BB implements AA{
    public void show(){
        System.out.println("Showwww");
    }}
public class FunctionalInterface {
    public static void main(String[] args) {
        //Now we cannot initialize the interface so there is a need of creating a class as to create object

        // method 1 is by using another class
        //method 2 we can also use anonymous class

        //method 1
//        BB obj = new BB();
//        obj.show();

        //method 2

        AA obj = new AA() {
            @Override
            public void show() {
                System.out.println("Hieeee this is anonymous");
            }
        };
        obj.show();
    }
}
//we can use lambda expression only with functional interface
