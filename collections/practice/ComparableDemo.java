package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    String name;
    int age;

    Students(String name, int age){
        this.name = name;
        this.age= age;
    }
    @Override
    public String toString(){
        return "Student [age= "+age+", name="+name+ "]";
    }
}
public class ComparableDemo {
    public static void main(String[] args) {

        Comparator<Students> studss = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.age > o2.age){
                    return 1;
                }
                else{
                return -1;
            }}
        };
        List<Students> studs = new ArrayList<>();
        studs.add(new Students("Ashwin", 21));
        studs.add(new Students("Rajesh", 33));
        studs.add(new Students("Om", 23));
        studs.add(new Students("Birla", 25));

        Collections.sort(studs, studss);
        for(Students s: studs){
            System.out.println(s);
        }

    }
}
