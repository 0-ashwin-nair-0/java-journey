package com.basics.practice;

import javax.swing.*;
import java.awt.im.InputSubset;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        int num = 0;
        //the println is a method of printstream class and the printstream object is out which is inside system class
        System.out.println("Enter a value: ");
//        try {
//            num = System.in.read(); //it will return the ascii value of the number or value entered
//            System.out.println(num-48);//no need of using ths

//            Option 2
//            InputStreamReader in = new InputStreamReader(System.in);
//            BufferedReader bf = new BufferedReader(in);//from where we want to take the input we can mention it here inside
//            num = Integer.parseInt(bf.readLine());
//            System.out.println(num);
//            bf.close();
//    }catch(IOException e){
//            System.out.println("Input error "+e.getMessage());
//        }}

        //Option 3
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }

}
