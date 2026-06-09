package com.exceptionhandling.practice;
//Creating our own Exception
//We have to extend Exception class
class AshwinException extends Exception{
    public AshwinException(String str){
        super(str);//this helps in passing the value of string to the parent class
    }
}
public class OwnException {
    public static void main(String[] args) {
        String name = "Ashwin";
        try{
            if(name.equals("Ashwin")){
                throw new AshwinException("Ashwin is sleeping");
            }
            System.out.println(name+" hieee!!");
        }catch (AshwinException e){
            System.out.println("Please don't call Ashwin\n"+e.getMessage());
        }
    }
}
