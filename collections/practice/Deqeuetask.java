package com.collections.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deqeuetask {
    //Insertion and deletion is possible from both endsd
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.addFirst(10);
        deq.addFirst(20);
        System.out.println(deq);
        System.out.println(deq.removeLast());
        deq.addFirst(30);
        System.out.println(deq);
    }
}
