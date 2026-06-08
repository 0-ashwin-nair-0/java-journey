package com.exceptionhandling.practice;

public class ExceptionTypes {
    public void data(int age){
        System.out.println("Your age: "+age);
    }
    public static void main(String[] args) {
        String name = null;
        int[] arr = {1,2,3};
        String program = "Java";
        int index = 6;
        ExceptionTypes et = new ExceptionTypes();

        try{
            et.data(23);
           // System.out.println(2/0);
       //     System.out.println(name.length());
          //  System.out.println(arr[index]);
            //System.out.println(program.charAt(index));
            int b = Integer.parseInt(program);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | StringIndexOutOfBoundsException | NumberFormatException   e){
            System.out.println(e.toString());
        }
    }
}
