package com.oops.practice;

//Interface is not a class
//Also by default the methods inside this will be public abstract so no need of mentioning that

interface H{

   // int age; - this will throw error because by  default in interface
    //the variables are final and static - so we have to declare it

    int age = 20;//the age variable is final and static

    void show();
    void config();
}

class C implements H{
    public void show(){
        System.out.println("HAHA");
    }

    public void config(){
        System.out.println("This is config");
    }
}

public class InterfaceCode {
    public static void main(String[] args) {
      //  H obj = new H(); - this will throw as interface cannot be instantiated

        C obj = new C();
        obj.config();
        obj.show();
        System.out.println(H.age);//we cannot change the variable
        //Interface have no own memory
    }
}
