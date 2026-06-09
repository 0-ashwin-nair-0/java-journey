package com.exceptionhandling.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//if we dont want to write catch after try - write finally
//finally will run
class AgeException extends Exception{
    public AgeException(String str){
        super(str);
    }
}
public class TryWithResources {
    public static void main(String[] args) {
        int age = 0;
        BufferedReader bf = null;
//irrespective of whether you got exception or not - the finally will be executed
//        try{
//            bf = new BufferedReader(new InputStreamReader(System.in)); //we can directly write like this instead of writing new InputStreamReader(System.in)
//            age = Integer.parseInt(bf.readLine());
//            if(age<18){
//                throw new AgeException("Age should be greater than 18");
//            }
//            System.out.println("Passed");
//        }catch(IOException e){
//            System.out.println("Error! "+e.getMessage());
//        }
//        catch(AgeException e){
//            System.out.println("Error "+e.getMessage());
//        }
//        finally{//will be executed at any cost
//            System.out.println("Code Executed");
//            try{
//            bf.close();
//        }catch (IOException e){
//            System.out.println(e);
//        }}
//    }
//}//finally block will be normally used to close the resources or stop n all

//but now we have another method too
        //the main advantage of it is - once the try block is executed the bufferedreader will be closed automatically!!
//        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
//            if(age<18){
//                throw new AgeException("Error!");
//            }
//        } - this is called try with resources


        }
    }