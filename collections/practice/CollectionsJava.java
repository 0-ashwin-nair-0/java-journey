package com.collections.practice;
//collection api - it is a concept
//collection - it is an interface
//collections - it is a class

import java.util.ArrayList;
import java.util.Collection;


//It is a dynamic array - as normal array is static - but this is dynamic changes its size according to need
public class CollectionsJava {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);

        for(int s: nums){
            System.out.println(s);
        }
    }
}
