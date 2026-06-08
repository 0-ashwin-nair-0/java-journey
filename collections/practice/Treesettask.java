package com.collections.practice;

import java.util.TreeSet;

public class Treesettask {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        //It automatically sorts the data internally
        //No duplicates are allowed
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        System.out.println(numbers);
        numbers.add(4);
        System.out.println(numbers.contains(4));
        for(int s : numbers){
            System.out.println(s);
        }
    }
}
