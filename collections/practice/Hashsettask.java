package com.collections.practice;

import java.util.HashSet;

public class Hashsettask {
    public static void main(String[] args) {
        //no duplicates allowed!!
        //Insertion order is not maintained
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(null);//can store 1 null value
        System.out.println(nums);
        System.out.println(nums.contains(20));
        nums.remove(10);
        System.out.println(nums);
        //add, remove and contains are very fast O(1)!!

        for(int s : nums){//will only
            System.out.println(s);
        }
    }
}
