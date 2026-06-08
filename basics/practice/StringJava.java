package com.basics.practice;

public class StringJava {
    public static void main(String[] args) {
        String name = new String("Ashwin");//behind the scene new String happens
        //we can directly write String name = "Ashwin";
        System.out.println("hieeee "+name);
        name = name + " Nair";
        //here - it creates a new object with Ashwin Nair
        //and the Ashwin which was written first will be eligible for garbage collection as no reference variable points to it
        //in heap there is something called string constant pool
        //the strings cannot be changed - the name is given as Ashwin so it cant be changed from Ashwin to some other name
        //every time - it checks in the string constant pool whether the value exist or not
        //for eg - if we create String s1 = "Ashwin"
        //and similarly String s2 = "Ashwin";
        //here 2 objects are not created - both s1 and s2 points to the same memory
        //but its case-sensitive - if we add another reference variable s3 with ashwin then new object will be created
        //the value of name is not changed here
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.length());

        //Mutable String  - which can be changed
        //Immutable String - which cannot be changed - by default string is immutable
        //So we have StringBuffer and StringBuilder - mutable
    }
}
