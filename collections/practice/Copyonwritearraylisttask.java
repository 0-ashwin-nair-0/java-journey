package com.collections.practice;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

//it creates a snapshot or a copy of the array and the modification is done of it - so no exceptions are thrown
//it is costly
public class Copyonwritearraylisttask {
    public static void main(String[] args) {
        CopyOnWriteArrayList <Integer> map = new CopyOnWriteArrayList<>();
        map.add(20);
        map.add(30);
        map.add(40);
        for(int e : map){
            System.out.println(e);
            map.add(50);
        }
        System.out.println(map);
    }
}


