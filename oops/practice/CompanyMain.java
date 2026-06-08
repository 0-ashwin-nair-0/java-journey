package com.oops.practice;
//This code is loosely coupled nothing here is forcing to be strict

interface Computer {
     void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding with Desktop");
    }
}
class LaptopDev implements Computer{
    public void code(){
        System.out.println("Coding with Laptop");
    }
}

class Developer{
    public void devCode(Computer cp){
        cp.code();
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Computer b1 = new LaptopDev();
        Computer b2 = new Desktop();
        Developer dev = new Developer();
        dev.devCode(b2);
    }
}