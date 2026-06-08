package com.collections.practice;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparatortask {
    int id;
    String name;

    Comparatortask(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return id + " " +name;
    }
}

class idComparator implements Comparator<Comparatortask>{
    @Override
    public int compare(Comparatortask s1 ,Comparatortask s2 ){
        return s1.id - s2.id;
    }
}

class nameComparator implements Comparator<Comparatortask>{
    @Override
    public int compare(Comparatortask c1 , Comparatortask c2){
        return c1.name.compareTo(c2.name);
    }
}

class MainComparator{
    public static void main(String[] args) {
        ArrayList<Comparatortask> comp = new ArrayList<>();
        comp.add(new Comparatortask(20 ,"Madara"));
        comp.add(new Comparatortask(15, "Garo"));
        comp.add(new Comparatortask(35, "James"));
     //   Collections.sort(comp, new idComparator());
        Collections.sort(comp, new nameComparator());
        System.out.println(comp);

    }
}
