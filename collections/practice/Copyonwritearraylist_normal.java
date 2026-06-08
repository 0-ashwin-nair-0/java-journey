package com.collections.practice;

import java.util.ArrayList;

public class Copyonwritearraylist_normal {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        for(int u : arr){
            System.out.println(u);
            arr.add(40);
        }
        System.out.println(arr);
    }
}
//here it will throw exception - no modification is allowed during iteration!!