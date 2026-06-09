package com.exceptionhandling.practice;

class HH{
    //we can use throws keyword and the Exception name -
    //it will be handled automatically
    public void show() throws ClassNotFoundException{

        //but if we don't want to handle exception
//        try{

            Class.forName("com.exceptionhandling.practice.CalclationError");

//        }catch (ClassNotFoundException e){
//            System.out.println("Class was not found! "+e.getMessage());
//        }

    }
}
public class UsingThrows {

    public static void main(String[] args)  {

        HH abc = new HH();
        try{
        abc.show();//but here there is problem
        //we should not throw exception for main

    }catch(ClassNotFoundException e){
            System.out.println("Error "+e);
            e.printStackTrace();
            // it will print all this stack
//            java.lang.ClassNotFoundException: BasicException
//            at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:580)
//            at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:490)
//            at java.base/java.lang.Class.forName0(Native Method)
//            at java.base/java.lang.Class.forName(Class.java:463)
//            at java.base/java.lang.Class.forName(Class.java:454)
//            at com.exceptionhandling.practice.HH.show(UsingThrows.java:11)
//            at com.exceptionhandling.practice.UsingThrows.main(UsingThrows.java:25)

        }
}}