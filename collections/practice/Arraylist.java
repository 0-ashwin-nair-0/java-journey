package com.collections.practice;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //Declaring an array of integer type - generics
        ArrayList<Integer> list = new ArrayList<>();//default capacity may be 10
        //Integer is wrapper of primitive data - int

        //adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Your entered numbers: "+list);

        //Accessing a single element
        System.out.println("Number at index 1: "+list.get(1));

        //Updating the element
        list.set(1,10);//Allow duplicates

        //Removing an element
        list.remove(2);

        System.out.println(list);

        //To check size of the arrraylist
        System.out.println(list.size());

        //To check whether a particular element is present inside array or not
        System.out.println(list.contains(10));

        //ENHANCED FOR LOOP
        for(int num:list){
            System.out.println(num+" ");
        }

        list.forEach(System.out::print);



    }
}
