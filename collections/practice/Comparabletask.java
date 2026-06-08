package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Comparabletask implements Comparable<Comparabletask> {
    int marks;
    String name;

    Comparabletask(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    @Override
    public String toString(){
        return marks + " "+name;
    }
    @Override
    public int compareTo(Comparabletask other) {
        return this.marks - other.marks;
    }

}

class Maintask {
    public static void main(String[] args) {
        ArrayList<Comparabletask> arr = new ArrayList<>();
        arr.add(new Comparabletask(99, "Ashwin"));
        arr.add(new Comparabletask(29, "Raghav"));
        arr.add(new Comparabletask(59, "Shivam"));
        Collections.sort(arr);
        System.out.println(arr);
    }
}
