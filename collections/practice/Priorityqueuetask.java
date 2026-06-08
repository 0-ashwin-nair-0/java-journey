package com.collections.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueuetask {
    public static void main(String[] args) {
        //Comparator.reverseOrder helps in getting the data biggest to smallest
        //default it is min heap
        PriorityQueue <Integer> oo = new PriorityQueue<>(Comparator.reverseOrder());
        oo.add(50);
        oo.add(10);
        oo.add(5);
        oo.add(30);
        System.out.println(oo);
        System.out.println(oo.poll());
        System.out.println(oo);
        System.out.println(oo.poll());
        System.out.println(oo);
    }
}
