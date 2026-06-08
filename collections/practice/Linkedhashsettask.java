package com.collections.practice;

import java.util.LinkedHashSet;

public class Linkedhashsettask {
    public static void main(String[] args) {
        LinkedHashSet<Integer> data = new LinkedHashSet<>();
        //It maintains insertion order - no duplicates are allowed here
        data.add(1);
        data.add(2);
        data.add(4);
        data.add(3);
        data.add(3);
        data.add(5);
        System.out.println(data);
        data.remove(3);
        System.out.println(data.contains(3));
        System.out.println(data);

    }
}
