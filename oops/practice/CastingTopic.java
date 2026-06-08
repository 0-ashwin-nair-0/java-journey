package com.oops.practice;

class L{
    public void show1(){
        System.out.println("in A show");
    }
}

class S extends L{
    public void show2(){
        System.out.println(" in B show");
    }
}

public class CastingTopic {
    public static void main(String[] args) {
        double d = 3.45;
        int i = (int)d;//this is typecasting

        L obj = (L)new S(); //Typecasting it with parent class
        //This is upcasting - happens behind the scene
        obj.show1();

        S obj1 = (S)obj;//this is downcasting
        //obj is of parent class and we are downcasting it to child class
        obj1.show2();

        //wrapper classes
        //If we directly assign a primitive value to the object type then it is auto boxing
        //If we want to fetch the value automatically then it is auto unboxing
        String str = "12";
        int num3 = Integer.parseInt(str);//this is used to get the value from the string
        System.out.println(num3*2);
    }
}
