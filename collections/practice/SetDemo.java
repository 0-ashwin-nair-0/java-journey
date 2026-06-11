package com.collections.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Set supports unique value
public class SetDemo {
    public static void main(String[] args) {
        //Treeset gives value in sorted format
        Set<Integer> setnums = new TreeSet<Integer>();
        setnums.add(50);
        setnums.add(40);
        setnums.add(90);
        setnums.add(90);//no duplicate values allowed
        //set will not be in ordered or sorted format

        Iterator<Integer> values = setnums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        for(int s: setnums){
            System.out.println(s);
        }
    }

}
