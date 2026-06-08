package com.basics.practice;

import java.util.Scanner;

public class StudentsArray {
    public static void main(String[] args) {
        String [] names = {"Ashwin", "Kinjal", "Cobra"};
        for(int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
        names[2] = "King";
        System.out.println(names[2]);
         //by default the elements will be 0 - the size will be 5 and all the elements in it will be 0
        int[] numbers= new int[5];
        numbers[0]= 5;
        numbers[2] = 10;
        //enhanced for loop - for each
        for(int s : numbers){
            System.out.println(s);
        }

    }
}
