package com.basics.practice;

class  Phone {
    String name;
    int price;
    //using static means shared among all objects
    static int length;
    static String thing;

    //Static block  it will be called only once
    //it will be called first - class are loaded first and then objects are instantiated
    //as class loading happens first - static block is loaded first
    //if we need to print static block even though without creating objects we have to use Class.forName and the name of the class - it will throw exception
    static {
        thing = "Phone";
        System.out.println("I am inside static block");
    }

    public void show() {
        System.out.println(name + " " + price + " " + length);
    }
}

public class UseStatic {
    //to call main we dont need to create object - static helps direct call
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("com.basics.practice.Phone");//this will call static block even without object creation
        //        Phone.length = 34;//static should be called with class name not the object
//    Phone p1 = new Phone();
//    p1.name = "Apple";
//    p1.price = 250000;
//    p1.show();
//
//    Phone p2 = new Phone();
//    p2.name = "Samsung";
//    p2.price = 45000;
//    p2.show();
//
//    //using static will make length value default for all objects



}
}
