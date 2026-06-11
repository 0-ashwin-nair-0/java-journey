package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparable {
    public static void main(String[] args) {
//to sort using our own logic we use comparator
        Comparator comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return i;
                }
                else
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(15);
        nums.add(54);
        nums.add(43);
        nums.add(29);
        Collections.sort(nums);

        System.out.println(nums);


    }
}
