package com.collections.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Interatortask {
    //Using Iterator to loop through the array
    //If we want to delete any element during iterator the safe method to do is using Iterator
    //do not use collection method to remove during iteration, causes error
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(30);
        al.add(40);
        Iterator <Integer> io = al.iterator();
        //iterator object created
        //to remove
        while(io.hasNext()){
            int j = io.next();
            if(j==30){
                io.remove();
                continue;
            }
            System.out.println(j);
        }
        System.out.println(al);
    }
}
