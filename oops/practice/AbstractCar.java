package com.oops.practice;

abstract class Car{
    //if we want to just declare a method - we have to use abstract keyword
    //such that when any other class extends this class it is compulsory to implement the abstract method too and declare there
    //abstract method can only exist in abstract class
    public abstract void drive();
        // dont know for know how to setup this
        //instead of defining it here - just declare it

//No compulsion that abstract class should also have abstract method
    //Normal method as well as Normal method
    public abstract void fly();
    public void playMusic(){
        System.out.println("PLay Music");
    }

}

//OBJECT OF ABSTRACT CLASS CANT BE MADE !!!!!!
//ABSTRACT CLASS OBJECT CANNOT BE BUILT!!!!


//now it becomes compulsory to implement the drive method
class WagonR extends Car{
//In the case where a class cannot implement all the methods of abstract class
    //The class itself is then made abstract class

    public void fly() {
        System.out.println("Flying...");
    }

    public void drive(){
        System.out.println("Driving a car");
    }
}

//we can make the object of concrete class 5
public class AbstractCar {
    public static void main(String[] args) {
        //Calling the reference type is okay but object type cannot be an abstract class
    Car obj = new WagonR();//Cannot create object of abstract class
    obj.drive();
    obj.playMusic();

    }
}
