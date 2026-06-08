package com.collections.practice;

import java.util.concurrent.ConcurrentHashMap;
//Concurrenthashmap helps in concurrency managing multi[le threads without any error
//both can simultaneously perform actions
public class ConcurrenthashmapTask {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> ko = new ConcurrentHashMap<>();
        ko.put(1, "Pen");
        ko.put(2, "Basket");
        System.out.println(ko);
    }
}
