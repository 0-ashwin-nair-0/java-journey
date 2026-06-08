package com.collections.practice;

import java.util.LinkedList;

import java.util.Queue;
//Queue follows first in first out principle
//it is an interface which is implemented by Linkedlist, PriorityQueue, ArrayDeque
public class Queuetask {
    public static void main(String[] args) {
    Queue<Integer> eoq = new LinkedList<>();
    eoq.add(20);
    eoq.add(10);
    eoq.add(50);
        System.out.println(eoq);
        eoq.offer(40);
        System.out.println(eoq);
        System.out.println(eoq.peek());
        System.out.println(eoq.poll());
        System.out.println(eoq);
}}

