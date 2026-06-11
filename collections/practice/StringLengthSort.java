package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthSort {
    public static void main(String[] args) {
//we can specify own logic for sorting
        Comparator<String> namessort = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<String> names = new ArrayList<>();
        names.add("Ashwin");
        names.add("Kinjal");
        names.add("Ram");
        names.add("John");
        names.add("Sara");
        names.add("Om");
        names.add("Navin");

        Collections.sort(names , namessort);
        System.out.println(names);
    }
}
