package com.collections.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Usingstreamtask {
    //printing only the even nos - and multiply by 2
    public static void main(String[] args) {
        //this is used to make array of fixed size

        List<Integer> nums =
                Arrays.asList(10,20,15,30,25,20);

        List<Integer> result = nums.stream()
               // .filter(n -> n % 2 == 0)
                .map(n -> n *2)//used to tranform the data
                .sorted(Comparator.reverseOrder())//using Comparator.reverseorder will print in desccending order
                .distinct()//removes duplicates

                .collect(Collectors.toList());
        System.out.println(result);
        //nums.add(50); cannot add here as the array size is fixed
        //nums.remove(2); - cannot remove here the mentioned are fixed


    }
}
