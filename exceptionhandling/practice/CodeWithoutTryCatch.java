package com.exceptionhandling.practice;

public class CodeWithoutTryCatch {
    public int sum(int a, int b){
        return a/b;
    }
//In this code error occurs and normal flow stops as no try catch block is used
    public static void main(String[] args) {
        CodeWithoutTryCatch ce = new CodeWithoutTryCatch();
        System.out.println(ce.sum(12, 0));
        System.out.println("Code Executed!!");//It will not be printed as the code stops above !!
    }

}
