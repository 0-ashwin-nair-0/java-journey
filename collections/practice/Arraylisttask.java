package com.collections.practice;

import java.util.ArrayList;

public class Arraylisttask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(3));
        numbers.add(2,100);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);

        for(int i=0;i<numbers.size()-1;i++){
            System.out.println(i);
        }

        for(int num : numbers){
            System.out.println(num);
        }
    }
}
